package com.example.alessander.findnearbyplaces;

import android.os.AsyncTask;

import com.google.android.gms.maps.GoogleMap;

public class GetNearbyPlaces extends AsyncTask<Object, String, String> {

    private String googleplaceDate, url;
    private GoogleMap mMap;

    @Override
    protected String doInBackground(Object... objects) {
        return null;
    }

    @Override
    protected void onPostExecute(String s) {

        super.onPostExecute(s);
    }
}
