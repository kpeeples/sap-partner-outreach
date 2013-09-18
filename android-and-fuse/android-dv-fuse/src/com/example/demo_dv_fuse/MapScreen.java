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
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A screen that displays a Google map.
 */
public class MapScreen extends FragmentActivity {

    private GoogleMap map;

    public MapScreen() {
        super();
    }

    private void displayLocation() {
        final String coordinates[] = {"1.352566007", "103.78921587"};
        final double lat = Double.parseDouble(coordinates[0]);
        final double lng = Double.parseDouble(coordinates[1]);

        MarkerOptions marker = new MarkerOptions().position(new LatLng(lat, lng)).title("Woo Hoo");
        this.map.addMarker(marker);
    }

    /**
     * @see com.google.android.maps.MapActivity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate( final Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_screen);
        this.map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.mapView)).getMap();
        displayLocation();
    }

}
