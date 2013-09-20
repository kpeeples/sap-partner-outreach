/*
 * Copyright 2013 JBoss Inc
 * 
 * Licensed under the Apache License","Version 2.0","the"License")); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing","software distributed under the License is distributed on
 * an"AS IS" BASIS","WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND","either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.example.demo_dv_fuse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.example.demo_dv_fuse.model.Airport;

/**
 * Provides the available airports.
 */
public final class AirportProvider {

    /**
     * All the available airports.
     */
    public static final List<Airport> AIRPORTS;

    static {
        AIRPORTS = new ArrayList<Airport>();
        AIRPORTS.add(new Airport("Allentown", "PA", "USA", "ABE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Abilene", "TX", "USA", "ABI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Albuquerque", "NM", "USA", "ABQ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Aberdeen", "SD", "USA", "ABR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Albany", "GA", "USA", "ABY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Nantucket", "MA", "USA", "ACK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Waco", "TX", "USA", "ACT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Eureka", "CA", "USA", "ACV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Atlantic City", "NJ", "USA", "ACY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kodiak", "AK", "USA", "ADQ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Alexandria", "LA", "USA", "AEX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Augusta", "GA", "USA", "AGS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Athens", "GA", "USA", "AHN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Alliance", "NE", "USA", "AIA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("King Salmon", "AK", "USA", "AKN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Albany", "NY", "USA", "ALB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Waterloo", "IA", "USA", "ALO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Alamosa", "CO", "USA", "ALS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Walla Walla", "WA", "USA", "ALW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Amarillo", "TX", "USA", "AMA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Anchorage", "AK", "USA", "ANC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Altoona", "PA", "USA", "AOO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Naples", "FL", "USA", "APF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Alpena", "MI", "USA", "APN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Watertown", "NY", "USA", "ART")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Aspen", "CO", "USA", "ASE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Atlanta", "GA", "USA", "ATL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Appleton", "WI", "USA", "ATW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Watertown", "SD", "USA", "ATY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Augusta", "ME", "USA", "AUG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Austin", "TX", "USA", "AUS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Asheville", "NC", "USA", "AVL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wilkes-Barre", "PA", "USA", "AVP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kalamazoo", "MI", "USA", "AZO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Burlington", "MA", "USA", "BBF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hartford", "CT", "USA", "BDL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bedford", "MA", "USA", "BED")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bethel", "AK", "USA", "BET")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Scottsbluff", "NE", "USA", "BFF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bakersfield", "CA", "USA", "BFL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Binghamton", "NY", "USA", "BGM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bangor", "ME", "USA", "BGR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bar Harbor", "ME", "USA", "BHB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Birmingham", "AL", "USA", "BHM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hilo", "Hawaii", "USA", "Big")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kailua-Kona", "Hawaii", "USA", "Big")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kamuela", "Hawaii", "USA", "Big")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Billings", "MT", "USA", "BIL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bismarck", "ND", "USA", "BIS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bemidji", "MN", "USA", "BJI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Beckley", "WV", "USA", "BKW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Brookings", "SD", "USA", "BKX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bluefield", "WV", "USA", "BLF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bellingham", "WA", "USA", "BLI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bloomington", "IN", "USA", "BMG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bloomington", "IL", "USA", "BMI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Nashville", "TN", "USA", "BNA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Boise", "ID", "USA", "BOI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Boston", "MA", "USA", "BOS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Beaumont", "TX", "USA", "BPT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Brunswick", "GA", "USA", "BQK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Burlington", "IA", "USA", "BRL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Brownsville", "TX", "USA", "BRO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Barrow", "AK", "USA", "BRW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Butte", "MT", "USA", "BTM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Baton Rouge", "LA", "USA", "BTR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bettles", "AK", "USA", "BTT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Burlington", "VT", "USA", "BTV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Buffalo", "NY", "USA", "BUF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Burbank", "CA", "USA", "BUR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Baltimore", "MD", "USA", "BWI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Bozeman", "MT", "USA", "BZN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbia", "SC", "USA", "CAE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Akron", "OH", "USA", "CAK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cordova", "AK", "USA", "CDV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Springfield", "MA", "USA", "CEF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cape Girardeau", "MO", "USA", "CGI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Chattanooga", "TN", "USA", "CHA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Chicago", "IL", "USA", "CHI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Charlottesville", "VA", "USA", "CHO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Charleston", "SC", "USA", "CHS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Chico", "CA", "USA", "CIC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cedar Rapids", "IA", "USA", "CID")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sault Ste. Marie", "MI", "USA", "CIU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Clarksburg", "WV", "USA", "CKB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Carlsbad", "CA", "USA", "CLD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cleveland", "OH", "USA", "CLE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("College Station", "TX", "USA", "CLL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Charlotte", "NC", "USA", "CLT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbus", "IN", "USA", "CLU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbus", "OH", "USA", "CMH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Champaign", "IL", "USA", "CMI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hancock", "MI", "USA", "CMX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Carlsbad", "NM", "USA", "CNM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cody", "WY", "USA", "COD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Colorado Springs", "CO", "USA", "COS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbia", "MO", "USA", "COU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Casper", "WY", "USA", "CPR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Corpus Christi", "TX", "USA", "CRP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Charleston", "WV", "USA", "CRW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbus", "GA", "USA", "CSG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cincinnati", "OH", "USA", "CVG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Clovis", "NM", "USA", "CVN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wausau", "WI", "USA", "CWA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Cheyenne", "WY", "USA", "CYS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Daytona Beach", "FL", "USA", "DAB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dallas", "TX", "USA", "DAL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dayton", "OH", "USA", "DAY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dubuque", "IA", "USA", "DBQ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Washington", "DC", "USA", "DCA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dodge City", "KS", "USA", "DDC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Decatur", "IL", "USA", "DEC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Denver", "CO", "USA", "DEN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dallas", "TX", "USA", "DFW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dothan", "AL", "USA", "DHN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dickinson", "ND", "USA", "DIK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dillingham", "AK", "USA", "DLG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Duluth", "MN", "USA", "DLH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Durango", "CO", "USA", "DRO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Des Moines", "IA", "USA", "DSM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Detroit", "MI", "USA", "DTT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Detroit", "MI", "USA", "DTW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Du Bois", "PA", "USA", "DUJ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Dutch Harbor, Unalaska Island", "AK", "USA", "DUT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Devils Lake", "ND", "USA", "DVL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kearney", "NE", "USA", "EAR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wenatchee", "WA", "USA", "EAT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Eau Claire", "WI", "USA", "EAU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Eek", "AK", "USA", "EEK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Houston", "TX", "USA", "EFD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Vail", "CO", "USA", "EGE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Elko", "NV", "USA", "EKO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("El Dorado", "AR", "USA", "ELD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Elmira", "NY", "USA", "ELM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("El Paso", "TX", "USA", "ELP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kenai", "AK", "USA", "ENA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Erie", "PA", "USA", "ERI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Escanaba", "MI", "USA", "ESC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Eugene", "OR", "USA", "EUG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Evansville", "IN", "USA", "EVV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New Bern", "NC", "USA", "EWN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Newark", "NJ", "USA", "EWR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Key West", "FL", "USA", "EYW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fairbanks", "AK", "USA", "FAI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fargo", "ND", "USA", "FAR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fresno", "CA", "USA", "FAT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fayetteville", "NC", "USA", "FAY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kalispell", "MT", "USA", "FCA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Flagstaff", "AZ", "USA", "FLG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Lauderdale", "FL", "USA", "FLL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Florence", "SC", "USA", "FLO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Farmington", "NM", "USA", "FMN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Flint", "MI", "USA", "FNT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Dodge", "IA", "USA", "FOD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sioux Falls", "SD", "USA", "FSD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Smith", "AR", "USA", "FSM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Wayne", "IN", "USA", "FWA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Yukon", "AK", "USA", "FYU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Great Bend", "KS", "USA", "GBD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Gillette", "WY", "USA", "GCC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Garden City", "KS", "USA", "GCK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Glendive", "MT", "USA", "GDV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Spokane", "WA", "USA", "GEG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Grand Forks", "ND", "USA", "GFK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Longview", "TX", "USA", "GGG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Grand Junction", "CO", "USA", "GJT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Greenville", "MS", "USA", "GLH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Gainesville", "FL", "USA", "GNV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Gulfport", "MS", "USA", "GPT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Green Bay", "WI", "USA", "GRB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Grand Island", "NE", "USA", "GRI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Killeen", "TX", "USA", "GRK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Grand Rapids", "MI", "USA", "GRR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Greensboro", "NC", "USA", "GSO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Greenville", "SC", "USA", "GSP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Great Falls", "MT", "USA", "GTF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbus", "MS", "USA", "GTR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Gunnison", "CO", "USA", "GUC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hagerstown", "MD", "USA", "HGR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hilton Head Island", "SC", "USA", "HHH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hibbing", "MN", "USA", "HIB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lake Havasu City", "AZ", "USA", "HII")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Helena", "MT", "USA", "HLN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Honolulu, Oahu", "HI", "USA", "HNL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hana, Maui", "HI", "USA", "HNM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hobbs", "NM", "USA", "HOB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Homer", "AK", "USA", "HOM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Huron", "SD", "USA", "HON")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hot Springs", "AR", "USA", "HOT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Houston", "TX", "USA", "HOU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("White Plains", "NY", "USA", "HPN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Harlingen", "TX", "USA", "HRL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Harrison", "AR", "USA", "HRO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Huntsville", "AL", "USA", "HSV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Huntington", "WV", "USA", "HTS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New Haven", "CT", "USA", "HVN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Havre", "MT", "USA", "HVR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hyannis", "MA", "USA", "HYA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hays", "KS", "USA", "HYS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Washington", "DC", "USA", "IAD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Houston", "TX", "USA", "IAH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wichita", "KS", "USA", "ICT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Idaho Falls", "ID", "USA", "IDA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kingman", "AZ", "USA", "IGM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wilmington", "DE", "USA", "ILG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wilmington", "NC", "USA", "ILM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Iron Mountain", "MI", "USA", "IMT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Indianapolis", "IN", "USA", "IND")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("International Falls", "MN", "USA", "INL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("El Centro", "CA", "USA", "IPL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Williamsport", "PA", "USA", "IPT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kirksville", "MO", "USA", "IRK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Williston", "ND", "USA", "ISN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Islip", "NY", "USA", "ISP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ithaca", "NY", "USA", "ITH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ironwood", "MI", "USA", "IWD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Inyokern", "CA", "USA", "IYK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jackson Hole", "WY", "USA", "JAC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jackson", "MS", "USA", "JAN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jacksonville", "FL", "USA", "JAX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jonesboro", "AR", "USA", "JBR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New York", "NY", "USA", "JFK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kapalua, Maui", "HI", "USA", "JHM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jamestown", "NY", "USA", "JHW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Joplin", "MO", "USA", "JLN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jamestown", "ND", "USA", "JMS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Juneau", "AK", "USA", "JNU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Johnstown", "PA", "USA", "JST")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ketchikan", "AK", "USA", "KTN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lansing", "MI", "USA", "LAN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Laramie", "WY", "USA", "LAR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Las Vegas", "NV", "USA", "LAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lawton", "OK", "USA", "LAW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Los Angeles", "CA", "USA", "LAX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lubbock", "TX", "USA", "LBB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Latrobe", "PA", "USA", "LBE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("North Platte", "NE", "USA", "LBF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Liberal", "KS", "USA", "LBL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lake Charles", "LA", "USA", "LCH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lebanon", "NH", "USA", "LEB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lewiston", "ME", "USA", "LEW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lexington", "KY", "USA", "LEX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lafayette", "LA", "USA", "LFT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New York", "NY", "USA", "LGA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Long Beach", "CA", "USA", "LGB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lihue, Kauai", "HI", "USA", "LIH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Little Rock", "AR", "USA", "LIT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Klamath Falls", "OR", "USA", "LMT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lincoln", "NE", "USA", "LNK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lancaster", "PA", "USA", "LNS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lanai City, Lanai", "HI", "USA", "LNY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Laredo", "TX", "USA", "LRD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Las Cruces", "NM", "USA", "LRU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("La Crosse", "WI", "USA", "LSE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kalaupapa, Molokai", "HI", "USA", "LUP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Greenbrier", "WV", "USA", "LWB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lewiston", "ID", "USA", "LWS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lewistown", "MT", "USA", "LWT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Lynchburg", "VA", "USA", "LYH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Midland", "TX", "USA", "MAF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Manistee", "MI", "USA", "MBL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Saginaw", "MI", "USA", "MBS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kansas City", "MO", "USA", "MCI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("McCook", "NE", "USA", "MCK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Macon", "GA", "USA", "MCN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Orlando", "FL", "USA", "MCO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Mason City", "IA", "USA", "MCW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Harrisburg", "PA", "USA", "MDT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Chicago", "IL", "USA", "MDW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Meridian", "MS", "USA", "MEI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Memphis", "TN", "USA", "MEM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("McAllen", "TX", "USA", "MFE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Medford", "OR", "USA", "MFR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Montgomery", "AL", "USA", "MGM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Morgantown", "WV", "USA", "MGW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Manhattan", "KS", "USA", "MHK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Manchester", "NH", "USA", "MHT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Miami", "FL", "USA", "MIA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Milwaukee", "WI", "USA", "MKE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Muskegon", "MI", "USA", "MKG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Hoolehua, Molokai", "HI", "USA", "MKK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jackson", "TN", "USA", "MKL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Melbourne", "FL", "USA", "MLB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Moline", "IL", "USA", "MLI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Miles City", "MT", "USA", "MLS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Monroe", "LA", "USA", "MLU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Mobile", "AL", "USA", "MOB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Modesto", "CA", "USA", "MOD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Minot", "ND", "USA", "MOT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Marquette", "MI", "USA", "MQT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Monterey", "CA", "USA", "MRY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Muscle Shoals", "AL", "USA", "MSL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Madison", "WI", "USA", "MSN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Missoula", "MT", "USA", "MSO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Minneapolis", "MN", "USA", "MSP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Massena", "NY", "USA", "MSS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New Orleans", "LA", "USA", "MSY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Montrose", "CO", "USA", "MTJ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Martha's Vineyard", "MA", "USA", "MVY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Marion", "IL", "USA", "MWA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Moses Lake", "WA", "USA", "MWH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Myrtle Beach", "SC", "USA", "MYR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("New York", "NY", "USA", "NYC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Jacksonville", "NC", "USA", "OAJ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Oakland", "CA", "USA", "OAK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Kahului, Maui", "HI", "USA", "OGG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ogdensburg", "NY", "USA", "OGS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Oklahoma City", "OK", "USA", "OKC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wolf Point", "MT", "USA", "OLF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Columbus", "NE", "USA", "OLU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Omaha", "NE", "USA", "OMA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Nome", "AK", "USA", "OME")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ontario", "CA", "USA", "ONT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Toksook Bay", "AK", "USA", "OOK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Chicago", "IL", "USA", "ORD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Norfolk", "VA", "USA", "ORF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Oshkosh", "WI", "USA", "OSH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("North Bend", "OR", "USA", "OTH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Owensboro", "KY", "USA", "OWB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Oxnard", "CA", "USA", "OXR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Paducah", "KY", "USA", "PAH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("West Palm Beach", "FL", "USA", "PBI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pendleton", "OR", "USA", "PDT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Portland", "OR", "USA", "PDX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Panama City", "FL", "USA", "PFN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Page", "AZ", "USA", "PGA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Greenville", "NC", "USA", "PGV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Newport News", "VA", "USA", "PHF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Philadelphia", "PA", "USA", "PHL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Phoenix", "AZ", "USA", "PHX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Peoria", "IL", "USA", "PIA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Laurel", "MS", "USA", "PIB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("St. Petersburg", "FL", "USA", "PIE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pocatello", "ID", "USA", "PIH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pierre", "SD", "USA", "PIR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pittsburgh", "PA", "USA", "PIT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Parkersburg", "WV", "USA", "PKB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pellston", "MI", "USA", "PLN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Ponca City", "OK", "USA", "PNC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pensacola", "FL", "USA", "PNS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Presque Isle", "ME", "USA", "PQI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Prescott", "AZ", "USA", "PRC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pasco", "WA", "USA", "PSC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Portsmouth", "NH", "USA", "PSM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Palm Springs", "CA", "USA", "PSP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pueblo", "CO", "USA", "PUB")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pullman", "WA", "USA", "PUW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Provincetown", "MA", "USA", "PVC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Providence", "RI", "USA", "PVD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Portland", "ME", "USA", "PWM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Los Angeles", "CA", "USA", "QLA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Francisco", "CA", "USA", "QSF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rapid City", "SD", "USA", "RAP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Redding", "CA", "USA", "RDD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Redmond", "OR", "USA", "RDM")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Raleigh", "NC", "USA", "RDU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rockford", "IL", "USA", "RFD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rhinelander", "WI", "USA", "RHI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Richmond", "VA", "USA", "RIC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Riverton", "WY", "USA", "RIW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rockland", "ME", "USA", "RKD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rock Springs", "WY", "USA", "RKS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Reno", "NV", "USA", "RNO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Roanoke", "VA", "USA", "ROA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rochester", "NY", "USA", "ROC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Roswell", "NM", "USA", "ROW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rochester", "MN", "USA", "RST")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Myers", "FL", "USA", "RSW")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Rutland", "VT", "USA", "RUT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Santa Fe", "NM", "USA", "SAF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Diego", "CA", "USA", "SAN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Antonio", "TX", "USA", "SAT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Savannah", "GA", "USA", "SAV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Santa Barbara", "CA", "USA", "SBA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("South Bend", "IN", "USA", "SBN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Luis Obispo", "CA", "USA", "SBP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Steamboat Springs", "CO", "USA", "SBS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Salisbury", "MD", "USA", "SBY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("State College", "PA", "USA", "SCE")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Louisville", "KY", "USA", "SDF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sand Point", "AK", "USA", "SDP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sidney", "MT", "USA", "SDY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Seattle", "WA", "USA", "SEA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Francisco", "CA", "USA", "SFO")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Springfield", "MO", "USA", "SGF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("St. George", "UT", "USA", "SGU")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Skagway", "AK", "USA", "SGY")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Shenandoah Valley Airport", "VA", "USA", "SHD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sheridan", "WY", "USA", "SHR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Shreveport", "LA", "USA", "SHV")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sitka", "AK", "USA", "SIT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Jose", "CA", "USA", "SJC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("San Angelo", "TX", "USA", "SJT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Salt Lake City", "UT", "USA", "SLC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Saranac Lake", "NY", "USA", "SLK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Salina", "KS", "USA", "SLN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sacramento", "CA", "USA", "SMF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Santa Maria", "CA", "USA", "SMX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Orange County", "CA", "USA", "SNA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Pinehurst", "NC", "USA", "SOP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Springfield", "IL", "USA", "SPI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wichita Falls", "TX", "USA", "SPS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sarasota", "FL", "USA", "SRQ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("St. Cloud", "MN", "USA", "STC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("St. Louis", "MO", "USA", "STL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Santa Rosa", "CA", "USA", "STS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sun Valley", "ID", "USA", "SUN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Sioux City", "IA", "USA", "SUX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Silver City", "NM", "USA", "SVC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Newburgh", "NY", "USA", "SWF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Syracuse", "NY", "USA", "SYR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Leonard Wood", "MO", "USA", "TBN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Telluride", "CO", "USA", "TEX")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tallahassee", "FL", "USA", "TLH")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Toledo", "OH", "USA", "TOL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Topeka", "KS", "USA", "TOP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tampa", "FL", "USA", "TPA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tri-City Airport", "TN", "USA", "TRI")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Trenton", "NJ", "USA", "TTN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tulsa", "OK", "USA", "TUL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tupelo", "MS", "USA", "TUP")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tucson", "AZ", "USA", "TUS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Traverse City", "MI", "USA", "TVC")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Thief River Falls", "MN", "USA", "TVF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Twin Falls", "ID", "USA", "TWF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Texarkana", "AR", "USA", "TXK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Tyler", "TX", "USA", "TYR")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Knoxville", "TN", "USA", "TYS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Quincy", "IL", "USA", "UIN")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Unalakleet", "AK", "USA", "UNK")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Victoria", "TX", "USA", "VCT")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Valdez", "AK", "USA", "VDZ")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Visalia", "CA", "USA", "VIS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Valdosta", "GA", "USA", "VLD")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fort Walton Beach", "FL", "USA", "VPS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Springfield", "VT", "USA", "VSF")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Washington", "DC", "USA", "WAS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Enid", "OK", "USA", "WDG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Wrangell", "AK", "USA", "WRG")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Worland", "WY", "USA", "WRL")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("West Yellowstone", "MT", "USA", "WYS")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        AIRPORTS.add(new Airport("Fayetteville", "AR", "USA", "XNA")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        
        Collections.sort(AIRPORTS, Airport.LOCATION_SORTER);
    }

}
