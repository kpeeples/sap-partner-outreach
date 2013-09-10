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

import android.os.Bundle;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;

/**
 * A screen that displays a Google map.
 */
public class MapScreen extends MapActivity {

    private MapView mapView;

    private void displayLocation() {
        final MapController mc = this.mapView.getController();
        final String coordinates[] = {"1.352566007", "103.78921587"};
        final double lat = Double.parseDouble(coordinates[0]);
        final double lng = Double.parseDouble(coordinates[1]);

        final GeoPoint p = new GeoPoint((int)(lat * 1E6), (int)(lng * 1E6));

        mc.animateTo(p);
        mc.setZoom(17);
        this.mapView.invalidate();
    }

    /**
     * @see com.google.android.maps.MapActivity#isRouteDisplayed()
     */
    @Override
    protected boolean isRouteDisplayed() {
        return false;
    }

    /**
     * @see com.google.android.maps.MapActivity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate( final Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen);
        this.mapView = (MapView)findViewById(R.id.mapview);
        this.mapView.setBuiltInZoomControls(true);
        this.mapView.setSatellite(true);
        displayLocation();
    }

}
