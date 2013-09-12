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
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;
import android.widget.TextView;
import com.example.demo_dv_fuse.model.Flight;
import com.example.demo_dv_fuse.model.FlightParcelable;

/**
 * The available flights tab UI.
 */
public final class FlightsTab extends Fragment {

    static final String ID = FlightsTab.class.getSimpleName();

    private TableLayout tableLayout;

    void handleFlightClicked( final int flightIndex ) {
        // TODO make sure Book It button is enabled
    }

    private void loadFlights() {
        final ArrayList<FlightParcelable> data = getActivity().getIntent()
                                                              .getParcelableArrayListExtra(FlightParcelable.ALTERNATIVE_FLIGHTS);

        final Context context = getActivity();
        int i = 0;

        for (final FlightParcelable flightParcelable : data) {
            final Flight flight = flightParcelable.getFlight();
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
                public void onClick( final View view ) {
                    handleFlightClicked(index);
                }
            });

            this.tableLayout.addView(row, new TableLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                                                                       ViewGroup.LayoutParams.WRAP_CONTENT));
            ++i;
        }
    }

    /**
     * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated( final Bundle newSavedInstanceState ) {
        super.onActivityCreated(newSavedInstanceState);
        setRetainInstance(true);
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
        loadFlights();
        return flightsTab;
    }

}
