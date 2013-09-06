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

import android.app.Fragment;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.AsyncTaskLoader;
import android.content.Loader;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * The details tab UI.
 */
public final class DetailsFragment extends Fragment implements LoaderCallbacks<Void> {

    static final String ID = DetailsFragment.class.getSimpleName();

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
    public Loader<Void> onCreateLoader( final int newArg0,
                                        final Bundle newArg1 ) {
        final AsyncTaskLoader<Void> loader = new AsyncTaskLoader<Void>(getActivity()) {

            /**
             * @see android.support.v4.content.AsyncTaskLoader#loadInBackground()
             */
            @Override
            public Void loadInBackground() {
                try {
                    throw new InterruptedException(); // TODO: remove
                    // TODO: do something
                } catch (final InterruptedException e) {
                    // TODO: handle
                }
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
        return inflater.inflate(R.layout.details_tab, container, false);
    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoaderReset(android.support.v4.content.Loader)
     */
    @Override
    public void onLoaderReset( final Loader<Void> newArg0 ) {
        // TODO Auto-generated method stub

    }

    /**
     * @see android.support.v4.app.LoaderManager.LoaderCallbacks#onLoadFinished(android.support.v4.content.Loader,
     *      java.lang.Object)
     */
    @Override
    public void onLoadFinished( final Loader<Void> newArg0,
                                final Void newArg1 ) {
        // TODO Auto-generated method stub

    }

}
