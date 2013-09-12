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
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.demo_dv_fuse.model.Flight;
import com.example.demo_dv_fuse.model.FlightParcelable;
import com.example.demo_dv_fuse.model.TerminalMap;
import com.example.demo_dv_fuse.model.TerminalMapParcelable;

/**
 * The details tab UI.
 */
public final class DetailsTab extends Fragment {

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

    private Flight flight;

    void handleViewAirportMapsSelected() {
        final Intent intent = new Intent(getActivity(), MapGalleryScreen.class);
        loadGalleryData(intent);
        startActivity(intent);
    }

    void handleViewGoogleMap() {
        final Intent intent = new Intent(getActivity(), MapScreen.class);
        startActivity(intent);
    }

    void loadFlightInfo() {
        // departure data
        this.departureIata.setText(this.flight.getIata());
        this.departureAirlines.setText(this.flight.getCarrier());
        this.departureFlightNumber.setText(this.flight.getFlightNumber());
        this.departureTime.setText(this.flight.getDepartureTime());
        this.departureAirportCode.setText(this.flight.getDepartureAirportCode());
        this.departureStatus.setText(this.flight.getStatus());

        // arrival data
        this.arrivalTime.setText(this.flight.getArrivalTime());
        this.arrivalAirportCode.setText(this.flight.getArrivalAirportCode());
        this.arrivalGate.setText(this.flight.getArrivalGate());
        this.arrivalTerminal.setText(this.flight.getArrivalTerminal());
    }

    void loadGalleryData( final Intent intent ) {
        // TODO load real data here
        final String uriPrefix = "android.resource://" + getActivity().getPackageName() + '/'; //$NON-NLS-1$
        final ArrayList<TerminalMapParcelable> data = new ArrayList<TerminalMapParcelable>(4);
        data.add(new TerminalMapParcelable(new TerminalMap(uriPrefix + R.drawable.las_terminal,
                                                           getString(R.string.las_airport), null)));
        data.add(new TerminalMapParcelable(new TerminalMap(uriPrefix + R.drawable.las_concourse_a_b_c_540_nl,
                                                           getString(R.string.las_airport),
                                                           getString(R.string.las_terminal_1_abc))));
        data.add(new TerminalMapParcelable(new TerminalMap(uriPrefix + R.drawable.las_concourse_d_540_nl,
                                                           getString(R.string.las_airport),
                                                           getString(R.string.las_terminal_1_d))));
        data.add(new TerminalMapParcelable(new TerminalMap(uriPrefix + R.drawable.las_terminal_3_540_nl,
                                                           getString(R.string.las_airport),
                                                           getString(R.string.las_terminal_3))));
        intent.putParcelableArrayListExtra(TerminalMapParcelable.TERMINAL_MAPS, data);
    }

    /**
     * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated( final Bundle savedInstanceState ) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);

        final FlightParcelable parcelable = getActivity().getIntent().getExtras()
                                                         .getParcelable(FlightParcelable.SELECTED_FLIGHT);
        this.flight = parcelable.getFlight();

        loadFlightInfo();
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

}
