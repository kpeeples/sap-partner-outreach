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

import java.util.ArrayList;
import java.util.List;
import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.content.Loader;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.example.demo_dv_fuse.model.Flight;

/**
 * The available flights tab UI.
 */
public final class FlightsTab extends Fragment implements LoaderCallbacks<Void> {

    static final String ID = FlightsTab.class.getSimpleName();

    private final List<Flight> flights = new ArrayList<Flight>();

    private TableLayout tableLayout;

    void addFlight( final Flight flight ) {
        this.flights.add(flight);
    }

    private void loadFlights() {
        final Context context = getActivity();
        int i = 0;

        for (final Flight flight : this.flights) {
            final TableRow row = new TableRow(context);
            row.setClickable(true);
            row.setFocusableInTouchMode(true);
            row.setBackgroundResource(android.R.drawable.list_selector_background);
            row.setLayoutParams(new LayoutParams(android.view.ViewGroup.LayoutParams.MATCH_PARENT,
                                                 android.R.attr.listPreferredItemHeight));

            { // carrier
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getCarrier());
                row.addView(textView);
            }

            { // flight number
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getFlightNumber());
                row.addView(textView);
            }

            { // departure time
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getDepartureTime());
                row.addView(textView);
            }

            { // departure airport
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getDepartureAirportCode());
                row.addView(textView);
            }

            { // arrival time
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getArrivalTime());
                row.addView(textView);
            }

            { // arrival airport
                final TextView textView = new TextView(context);
                textView.setPadding(10, 4, 4, 10);
                textView.setText(flight.getArrivalAirportCode());
                row.addView(textView);
            }

            final int index = i;
            row.setOnClickListener(new View.OnClickListener() {

                /**
                 * @see android.view.View.OnClickListener#onClick(android.view.View)
                 */
                @Override
                public void onClick( View view ) {
                    handleFlightClicked(index);
                }
            });

            this.tableLayout.addView(row, new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                       ViewGroup.LayoutParams.WRAP_CONTENT));
            ++i;
        }
    }

    void handleFlightClicked( int flightIndex ) {
        // TODO make sure Book It button is enabled
    }

    /**
     * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated( final Bundle newSavedInstanceState ) {
        super.onActivityCreated(newSavedInstanceState);
        setRetainInstance(true);

        // initiate the loader to do the background work
        getLoaderManager().initLoader(0, null, this);
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onCreateLoader(int, android.os.Bundle)
     */
    @Override
    public Loader<Void> onCreateLoader( final int id,
                                        final Bundle args ) {
        final AsyncTaskLoader<Void> loader = new AsyncTaskLoader<Void>(getActivity()) {

            /**
             * @see android.support.v4.content.AsyncTaskLoader#loadInBackground()
             */
            @Override
            public Void loadInBackground() {
                // TODO: replace with call to get flights
                addFlight(new Flight("American", "100", "1:00 PM", "ORD", "3:00 PM", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
                addFlight(new Flight("Delta", "200", "2:00 PM", "ORD", "4:00 PM", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
                addFlight(new Flight("Virgin", "300", "3:00 PM", "ORD", "5:00 PM", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
                addFlight(new Flight("United", "400", "4:00 PM", "ORD", "6:00 PM", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
                addFlight(new Flight("Southwest", "500", "5:00 PM", "ORD", "6:00 PM", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$

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
        final View flightsTab = inflater.inflate(R.layout.flights_tab, container, false);
        this.tableLayout = (TableLayout)flightsTab.findViewById(R.id.flights_table);
        return flightsTab;
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoaderReset(android.support.v4.content.Loader)
     */
    @Override
    public void onLoaderReset( final Loader<Void> loader ) {
        loadFlights();
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoadFinished(android.support.v4.content.Loader,
     *      java.lang.Object)
     */
    @Override
    public void onLoadFinished( final Loader<Void> loader,
                                final Void data ) {
        loadFlights();
    }

}
