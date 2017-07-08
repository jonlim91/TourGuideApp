package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                 Bundle savedInstanceState) {

        /*TextView textView = new TextView(getActivity());
        textView.setText(R.string.category_food);
        return textView;*/


        View rootView = inflater.inflate(R.layout.tour_destination_list, container, false);

        final ArrayList<TourDestination> dest = new ArrayList<TourDestination>();

        dest.add(new TourDestination("Normandy House Lounge",
                "30 Washington St\n" + "Santa Clara, CA 95050",
                "(408) 244-1937"));

        dest.add(new TourDestination("LVL 44",
                "44 S Almaden Ave\n" + "San Jose, CA 95113",
                "(408) 331-8419"));

        dest.add(new TourDestination("Temple Bar & Lounge",
                "52 S 1st St\n" + "San Jose, CA 95113",
                "(408) 471-8675"));

        dest.add(new TourDestination("Cardiff & Cocktails",
                "266 E Campbell Ave\n" + "Campbell, CA 95008",
                "(669) 273-4915"));


        DestinationAdapter adapter = new DestinationAdapter(getActivity(), dest);



        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
