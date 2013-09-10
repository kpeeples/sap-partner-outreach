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

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A screen that displays a set of maps by using swipe gestures.
 */
public final class MapGalleryScreen extends Activity {

    static final int[] MAP_IDS = {R.drawable.map_a, R.drawable.map_b, R.drawable.map_c};

    private LayoutInflater inflater;

    private ViewPager mapPager;

    private PagerAdapter pageAdapter;

    void goToMap( final int index ) {
        this.mapPager.setCurrentItem(index);
    }

    LayoutInflater inflater() {
        return this.inflater;
    }

    /**
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate( final Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_gallery);

        this.inflater = getLayoutInflater();
        this.pageAdapter = new ImagePageAdapter();
        this.mapPager = (ViewPager)findViewById(R.id.map_pager);
        this.mapPager.setAdapter(this.pageAdapter);
    }

    class ImagePageAdapter extends PagerAdapter {

        /**
         * @see android.support.v4.view.PagerAdapter#destroyItem(android.view.View, int, java.lang.Object)
         */
        @Override
        public void destroyItem( final View container,
                                 final int position,
                                 final Object object ) {
            ((ViewPager)container).removeView((View)object);
        }

        /**
         * @see android.support.v4.view.PagerAdapter#getCount()
         */
        @Override
        public int getCount() {
            return MAP_IDS.length;
        }

        /**
         * @see android.support.v4.view.PagerAdapter#instantiateItem(android.view.ViewGroup, int)
         */
        @Override
        public Object instantiateItem( final ViewGroup container,
                                       final int position ) {
            final View view = inflater().inflate(R.layout.map_gallery_page, null);

            { // load map image
                final ImageView map = (ImageView)view.findViewById(R.id.mapImage);
                map.setImageResource(MAP_IDS[position]);
            }

            { // hook up left button
                final Button btnLeft = (Button)view.findViewById(R.id.btnPrevious);

                if (position == 0) {
                    btnLeft.setEnabled(false);
                } else {
                    btnLeft.setOnClickListener(new OnClickListener() {

                        /**
                         * @see android.view.View.OnClickListener#onClick(android.view.View)
                         */
                        @Override
                        public void onClick( final View newV ) {
                            goToMap(position - 1);
                        }
                    });
                }
            }

            { // hook up right button
                final Button btnRight = (Button)view.findViewById(R.id.btnNext);

                if (position == (MAP_IDS.length - 1)) {
                    btnRight.setEnabled(false);
                } else {
                    btnRight.setOnClickListener(new OnClickListener() {

                        /**
                         * @see android.view.View.OnClickListener#onClick(android.view.View)
                         */
                        @Override
                        public void onClick( final View newV ) {
                            goToMap(position + 1);
                        }
                    });
                }
            }

            ((ViewPager)container).addView(view, 0);
            return view;

        }

        /**
         * @see android.support.v4.view.PagerAdapter#isViewFromObject(android.view.View, java.lang.Object)
         */
        @Override
        public boolean isViewFromObject( final View view,
                                         final Object object ) {
            return (view == object);
        }

    }

}
