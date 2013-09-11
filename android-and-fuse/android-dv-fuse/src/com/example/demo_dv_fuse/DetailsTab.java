/*
 * Copyright 2013 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.example.demo_dv_fuse;

import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.AsyncTaskLoader;
import android.content.Intent;
import android.content.Loader;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * The details tab UI.
 */
public final class DetailsTab extends Fragment implements LoaderCallbacks<Void> {

    private static final int AIRPORT_MAPS_INDEX = 1; // list header is index zero
    private static final int GOOGLE_MAPS_INDEX = 2;
    static final String ID = DetailsTab.class.getSimpleName();

    private TextView arrivalAirportCode;
    private TextView arrivalGate;
    private TextView arrivalTerminal;
    private TextView arrivalTime;
    private TextView departureAirlines;
    private TextView departureAirportCode;
    private TextView departureFlightNumber;
    private TextView departureIata;
    private TextView departureStatus;
    private TextView departureTime;

    void handleViewAirportMapsSelected() {
        final Intent intent = new Intent(getActivity(), MapGalleryScreen.class);
        startActivity(intent);
    }

    void handleViewGoogleMap() {
        final Intent intent = new Intent(getActivity(), MapScreen.class);
        startActivity(intent);
    }

    void loadData( final boolean clear ) {
        final String defaultValue = ""; //$NON-NLS-1$
        final SharedPreferences prefs = PrefMgr.get().prefs();

        // departure data
        this.departureIata.setText(clear ? defaultValue : '(' + prefs.getString(PrefMgr.Preference.DEPARTURE_IATA,
                                                                                defaultValue) + ')');
        this.departureAirlines.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.DEPARTURE_AIRLINES,
                                                                              defaultValue));
        this.departureFlightNumber.setText(clear ? defaultValue
                        : prefs.getString(PrefMgr.Preference.DEPARTURE_FLIGHT_NUMBER, defaultValue));
        this.departureTime.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.DEPARTURE_TIME,
                                                                          defaultValue));
        this.departureAirportCode.setText(clear ? defaultValue
                        : prefs.getString(PrefMgr.Preference.DEPARTURE_AIRPORT_CODE, defaultValue));
        this.departureStatus.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.DEPARTURE_STATUS,
                                                                            defaultValue));

        // arrival data
        this.arrivalTime.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.ARRIVAL_TIME, defaultValue));
        this.arrivalAirportCode.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.ARRIVAL_AIRPORT_CODE,
                                                                               defaultValue));
        this.arrivalGate.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.ARRIVAL_GATE, defaultValue));
        this.arrivalTerminal.setText(clear ? defaultValue : prefs.getString(PrefMgr.Preference.ARRIVAL_TERMINAL,
                                                                            defaultValue));
    }

    /**
     * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated( final Bundle savedInstanceState ) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);

        // initiate the loader to do the background work
        getLoaderManager().initLoader(0, null, this);
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onCreateLoader(int, android.os.Bundle)
     */
    @Override
    public Loader<Void> onCreateLoader( final int newArg0,
                                        final Bundle newArg1 ) {
        final AsyncTaskLoader<Void> loader = new AsyncTaskLoader<Void>(getActivity()) {

            /**
             * @see android.support.v4.content.AsyncTaskLoader#loadInBackground()
             */
            @Override
            public Void loadInBackground() {
                final SharedPreferences prefs = PrefMgr.get().prefs();
                final Editor editor = prefs.edit();

                editor.putString(PrefMgr.Preference.ARRIVAL_AIRPORT_CODE, "LAS"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.ARRIVAL_GATE, "C24"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.ARRIVAL_TERMINAL, "1"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.ARRIVAL_TIME, "1:59 PM"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_AIRLINES, "American Airlines"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_AIRPORT_CODE, "ORD"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_FLIGHT_NUMBER, "8307"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_IATA, "AA"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_STATUS, "DELAYED"); //$NON-NLS-1$
                editor.putString(PrefMgr.Preference.DEPARTURE_TIME, "1:10 PM"); //$NON-NLS-1$

                editor.apply();

                return null;
            }
        };

        loader.forceLoad();
        return loader;
    }

    /**
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup,
     *      android.os.Bundle)
     */
    @Override
    public View onCreateView( final LayoutInflater inflater,
                              final ViewGroup container,
                              final Bundle savedInstanceState ) {
        final View view = inflater.inflate(R.layout.details_tab, container, false);

        final String[] choices = {getString(R.string.viewAirportMaps), getString(R.string.viewGoogleMap)};
        final ListView listView = (ListView)view.findViewById(R.id.detailsList);

        final View headerView = inflater.inflate(R.layout.details_list_header, null);
        listView.addHeaderView(headerView, null, false);

        listView.setAdapter(new ArrayAdapter<String>(container.getContext(), R.layout.details_row,
                                                     R.id.details_list_map_row_title, choices));
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            /**
             * @see android.widget.AdapterView.OnItemClickListener#onItemClick(android.widget.AdapterView,
             *      android.view.View, int, long)
             */
            @Override
            public void onItemClick( final AdapterView<?> adapterView,
                                     final View parent,
                                     final int position,
                                     final long id ) {
                if (position == AIRPORT_MAPS_INDEX) {
                    handleViewAirportMapsSelected();
                } else if (position == GOOGLE_MAPS_INDEX) {
                    handleViewGoogleMap();
                }
            }
        });

        // departure widgets
        this.departureAirlines = (TextView)view.findViewById(R.id.departure_airlines);
        this.departureAirportCode = (TextView)view.findViewById(R.id.departure_airport_code);
        this.departureFlightNumber = (TextView)view.findViewById(R.id.departure_flight_number);
        this.departureIata = (TextView)view.findViewById(R.id.departure_iata);
        this.departureStatus = (TextView)view.findViewById(R.id.departure_status);
        this.departureTime = (TextView)view.findViewById(R.id.departure_time);

        // arrival widgets
        this.arrivalAirportCode = (TextView)view.findViewById(R.id.arrival_airport_code);
        this.arrivalGate = (TextView)view.findViewById(R.id.arrival_gate);
        this.arrivalTerminal = (TextView)view.findViewById(R.id.arrival_terminal);
        this.arrivalTime = (TextView)view.findViewById(R.id.arrival_time);

        return view;
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoaderReset(android.support.v4.content.Loader)
     */
    @Override
    public void onLoaderReset( final Loader<Void> loader ) {
        loadData(true);
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoadFinished(android.support.v4.content.Loader,
     *      java.lang.Object)
     */
    @Override
    public void onLoadFinished( final Loader<Void> loader,
                                final Void object ) {
        loadData(false);
    }

}
