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

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

final class PrefMgr {

    private static PrefMgr _prefMgr;

    static PrefMgr get() {
        return _prefMgr;
    }

    private final Context context;

    private final SharedPreferences prefs;

    PrefMgr( final Context appContext ) {
        this.context = appContext;

        final String prefsName = this.context.getClass().getPackage().getName();
        this.prefs = this.context.getSharedPreferences(prefsName, Context.MODE_PRIVATE);

        _prefMgr = this;
    }

    void clearMaps() {
        final int mapCount = this.prefs.getInt(Preference.MAP_COUNT, 0);

        if (mapCount != 0) {
            final Editor editor = this.prefs.edit();
            editor.remove(Preference.MAP_COUNT);

            for (int i = 0; i < mapCount; ++i) {
                editor.remove(Preference.MAP_URI + i);
                editor.remove(Preference.MAP_TITLE + i);
                editor.remove(Preference.MAP_SUBTITLE + i);
            }

            editor.apply();
        }
    }

    SharedPreferences prefs() {
        return this.prefs;
    }

    interface Preference {

        String ARRIVAL_AIRPORT_CODE = "arrival.airportCode"; //$NON-NLS-1$
        String ARRIVAL_GATE = "arrival.gate"; //$NON-NLS-1$
        String ARRIVAL_TERMINAL = "arrival.terminal"; //$NON-NLS-1$
        String ARRIVAL_TIME = "arrival.time"; //$NON-NLS-1$
        String DEPARTURE_AIRLINES = "departure.airlines"; //$NON-NLS-1$
        String DEPARTURE_AIRPORT_CODE = "departure.airportCode"; //$NON-NLS-1$
        String DEPARTURE_FLIGHT_NUMBER = "departure.flightNumber"; //$NON-NLS-1$
        String DEPARTURE_IATA = "departure.iata"; //$NON-NLS-1$
        String DEPARTURE_STATUS = "departure.status"; //$NON-NLS-1$
        String DEPARTURE_TIME = "departure.time"; //$NON-NLS-1$

        String MAP_COUNT = "map.count"; //$NON-NLS-1$
        String MAP_SUBTITLE = "map.subtitle."; //$NON-NLS-1$
        String MAP_TITLE = "map.title."; //$NON-NLS-1$
        String MAP_URI = "map.uri."; //$NON-NLS-1$

    }

}
