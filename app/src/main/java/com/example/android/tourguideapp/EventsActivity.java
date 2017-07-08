package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jonathan on 6/25/2017.
 */

public class EventsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new EventsFragment())
                .commit();
    }
}
