package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
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

        dest.add(new TourDestination("Kiraku Sushi",
                "20 Washington St\n" + "Santa Clara, CA 95050",
                "(408) 984-1518"));

        dest.add(new TourDestination("Wrap This",
                "2281 The Alameda\n"+ "Santa Clara, CA 95050",
                "(408) 246-9727"));

        dest.add(new TourDestination("Ramen Taka",
                "2219 The Alameda\n" + "Santa Clara, CA 95050",
                "(408) 564-4467"));

        dest.add(new TourDestination("In-N-Out Burger",
                "550 Newhall Dr\n" +"San Jose, CA 95110",
                "(800) 786-1000"));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), dest);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
