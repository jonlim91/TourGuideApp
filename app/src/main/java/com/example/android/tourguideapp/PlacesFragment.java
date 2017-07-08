package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
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

        dest.add(new TourDestination("San Jose Municipal Rose Garden",
                "Naglee Ave & Dana Ave\n" + "San Jose, CA 95126",
                "(408) 794-7275", R.drawable.rose_garden));

        dest.add(new TourDestination("San Jose Museum of Art",
                "110 S Market St\n" + "San Jose, CA 95110",
                "(408) 271-6840", R.drawable.art_museum));

        dest.add(new TourDestination("Winchester Mystery House",
                "525 S Winchester Blvd\n" + "San Jose, CA 95128",
                "(408) 247-2000", R.drawable.mystery_house));

        dest.add(new TourDestination("Cathedral Basilica of St. Joseph",
                "80 S Market St\n" + "San Jose, CA 95113-2303",
                "408-283-8100", R.drawable.cathedral));


        DestinationAdapter adapter = new DestinationAdapter(getActivity(), dest);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        final ImageView locationImage = (ImageView) listView.findViewById(R.id.location_image);

        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(locationImage.getVisibility()==View.GONE) {
                    locationImage.setVisibility(View.VISIBLE);
                }
                else{
                    locationImage.setVisibility(View.GONE);
                }
            }
        });*/

        return rootView;
    }

}
