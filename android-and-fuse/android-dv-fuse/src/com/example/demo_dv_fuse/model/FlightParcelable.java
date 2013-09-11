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
package com.example.demo_dv_fuse.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * A representation of a {@link Flight} that can be passed into an intent extra.
 */
public final class FlightParcelable implements Parcelable {

    /**
     * Used to un-marshal or de-serialize a flight from a parcel.
     */
    public static final Parcelable.Creator<FlightParcelable> CREATOR = new Parcelable.Creator<FlightParcelable>() {

        /**
         * @see android.os.Parcelable.Creator#createFromParcel(android.os.Parcel)
         */
        @Override
        public FlightParcelable createFromParcel( final Parcel in ) {
            return new FlightParcelable(in);
        }

        /**
         * @see android.os.Parcelable.Creator#newArray(int)
         */
        @Override
        public FlightParcelable[] newArray( final int size ) {
            return new FlightParcelable[size];
        }
    };

    private final Flight flight;

    /**
     * @param flightModel the flight model (cannot be <code>null</code> or empty)
     */
    public FlightParcelable( final Flight flightModel ) {
        this.flight = flightModel;
    }

    FlightParcelable( final Parcel in ) {
        final String arrivalAirportCode = in.readString();
        final String arrivalTime = in.readString();
        final String carrier = in.readString();
        final String departureAirportCode = in.readString();
        final String departureTime = in.readString();
        final String flightNumber = in.readString();
        this.flight = new Flight(arrivalAirportCode, arrivalTime, carrier, departureAirportCode, departureTime,
                                 flightNumber);
    }

    /**
     * @see android.os.Parcelable#describeContents()
     */
    @Override
    public int describeContents() {
        return hashCode();
    }

    /**
     * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
     */
    @Override
    public void writeToParcel( final Parcel dest,
                               final int flags ) {
        dest.writeString(this.flight.getArrivalAirportCode());
        dest.writeString(this.flight.getArrivalTime());
        dest.writeString(this.flight.getCarrier());
        dest.writeString(this.flight.getDepartureAirportCode());
        dest.writeString(this.flight.getDepartureTime());
        dest.writeString(this.flight.getFlightNumber());
    }

}
