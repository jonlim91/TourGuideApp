package com.example.android.tourguideapp;

import android.icu.text.SimpleDateFormat;
import android.location.Location;

import static android.R.attr.phoneNumber;

/**
 * Created by Jonathan on 6/25/2017.
 */

public class TourDestination {

    private static final int NO_IMAGE_PROVIDED = -1;

    //member variables for each destination tourists might want to visit

    private String mTitle;
    private String mAddress;
    private String mDestPhoneNumber;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mEventDate;
    private boolean mIsEvent = false;

    /**
     * Constructor creates a new TourDestination object with initial values for location, phone number
     */

    TourDestination(String title, String address, String phoneNumber) {
        mTitle = title;
        mAddress = address;
        mDestPhoneNumber = phoneNumber;
    }

    /**
     * Constructor creates a new TourDestination object with initial values for location, phone number, and image (for restaurants)
     */

    TourDestination(String title, String address, String phoneNumber, int imageResourceId) {
        mTitle = title;
        mAddress = address;
        mDestPhoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Constructor creates a new TourDestination object with initial values for location, phone number, date (for events)
     */

    TourDestination(String title, String address, String phoneNumber, String date, boolean isEvent) {
        mTitle = title;
        mAddress = address;
        mDestPhoneNumber = phoneNumber;
        mEventDate = date;
        mIsEvent = isEvent;
    }

    /**
     * Return the title for this destination
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Return the address for this destination
     */

    public String getAddress() {
        return mAddress;
    }

    /**
     * Return the phone number for this destination
     */

    public String getPhoneNumber() {
        return mDestPhoneNumber;
    }

    /**
     * Return the date for this event
     */

    public String getEventDate() {
        return mEventDate;
    }

    /**
     * Returns true if it's an event, replace phone number with date in list item
     */

    public boolean isEvent() {
        return mIsEvent;
    }

    /**
     * Return whether word has a valid image
     */
    public boolean hasValidImage() {
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}