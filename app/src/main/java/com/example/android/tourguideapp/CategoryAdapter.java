package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jonathan on 6/25/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    final int PAGE_COUNT = 4; //4 tabs for Numbers, Family, Colors, and Phrases
    //private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();

        } else if (position == 1){
            return new NightlifeFragment();
        } else if (position == 2) {
            return new PlacesFragment();
        }
        else //position = 3
        {
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getString(R.string.category_food);
        }
        else if (position == 1) {
            return mContext.getString(R.string.category_nightlife);
        }
        else if(position == 2) {
            return mContext.getString(R.string.category_places);
        }
        else {
            return mContext.getString(R.string.category_events);
        }
    }
}
