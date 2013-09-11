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

/**
 * An immutable flight business object.
 */
public final class Flight {

    private final String arrivalAirportCode;

    private final String arrivalTime;

    private final String carrier;

    private final String departureAirportCode;

    private final String departureTime;

    private final String flightNumber;

    /**
     * @param theCarrier the carrier (cannot be <code>null</code> or empty)
     * @param theFlightNumber the carrier (cannot be <code>null</code> or empty)
     * @param theDepartureTime the carrier (cannot be <code>null</code> or empty)
     * @param theDepartureAirportCode the carrier (cannot be <code>null</code> or empty)
     * @param theArrivalTime the carrier (cannot be <code>null</code> or empty)
     * @param theArrivalAirportCode the carrier (cannot be <code>null</code> or empty)
     */
    public Flight( final String theCarrier,
                   final String theFlightNumber,
                   final String theDepartureTime,
                   final String theDepartureAirportCode,
                   final String theArrivalTime,
                   final String theArrivalAirportCode ) {
        if (((theCarrier == null) || theCarrier.isEmpty()) || ((theFlightNumber == null) || theFlightNumber.isEmpty())
                        || ((theDepartureTime == null) || theDepartureTime.isEmpty())
                        || ((theDepartureAirportCode == null) || theDepartureAirportCode.isEmpty())
                        || ((theArrivalTime == null) || theArrivalTime.isEmpty())
                        || ((theArrivalAirportCode == null) || theArrivalAirportCode.isEmpty())) {
            throw new RuntimeException();
        }

        this.carrier = theCarrier;
        this.flightNumber = theFlightNumber;
        this.departureTime = theDepartureTime;
        this.departureAirportCode = theDepartureAirportCode;
        this.arrivalTime = theArrivalTime;
        this.arrivalAirportCode = theArrivalAirportCode;
    }

    /**
     * @return the airport code of the arrival location (never <code>null</code> or empty)
     */
    public String getArrivalAirportCode() {
        return this.arrivalAirportCode;
    }

    /**
     * @return the time of arrival (never <code>null</code> or empty)
     */
    public String getArrivalTime() {
        return this.arrivalTime;
    }

    /**
     * @return the carrier (never <code>null</code> or empty)
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return the airport code of the departure location (never <code>null</code> or empty)
     */
    public String getDepartureAirportCode() {
        return this.departureAirportCode;
    }

    /**
     * @return the departure time (never <code>null</code> or empty)
     */
    public String getDepartureTime() {
        return this.departureTime;
    }

    /**
     * @return the flight number (never <code>null</code> or empty)
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

}
