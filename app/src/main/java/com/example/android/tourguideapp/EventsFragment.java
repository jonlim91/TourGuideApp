package com.example.android.tourguideapp;


import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
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

        dest.add(new TourDestination("The Book of Mormon",
                "San Jose Center for the Performing Arts\n" + "255 S Almaden Blvd\n" + "San Jose, CA 95113",
                "(408) 792-4542", "Tues July 11, 2017 @ 7:30 PM", true));

        dest.add(new TourDestination("Eintracht Frankfurt at San Jose Earthquakes",
                "Avaya Stadium\n" +
                        "1123 Coleman Avenue\n" + "San Jose, California 95110",
                "(408) 556-7700", "Fri July 14, 2017 @ 7:15 PM", true));

        dest.add(new TourDestination("G‑DRAGON 2017 World Tour Act III, M.O.T.T.E",
                "SAP Center at San Jose\n" +"San Jose, CA, 95113",
                "(408) 984-1518", "Fri July 14, 2017 @ 8:00 PM", true));

        dest.add(new TourDestination("Bruno Mars: 24K Magic World Tour",
                "SAP Center at San Jose\n" +"San Jose, CA, 95113",
                "(408) 984-1518", "Fri July 21, 2017 @ 8:00 PM", true));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), dest);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
