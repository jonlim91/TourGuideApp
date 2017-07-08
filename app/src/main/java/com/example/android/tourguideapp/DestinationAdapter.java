package com.example.android.tourguideapp;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jonathan on 7/8/2017.
 */

public class DestinationAdapter extends ArrayAdapter<TourDestination> {

    private int mItemBackgroundColor;

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final TourDestination dest = getItem(position);

        TextView destTitle = (TextView) listItemView.findViewById(R.id.title);
        destTitle.setText(dest.getTitle());

        TextView destAddress = (TextView) listItemView.findViewById(R.id.address);
        destAddress.setText(dest.getAddress());

        TextView destDateOrNumber = (TextView) listItemView.findViewById(R.id.phone_number_or_date);

        if (dest.isEvent()) {
            destDateOrNumber.setText(dest.getEventDate());
        } else {
            destDateOrNumber.setText(dest.getPhoneNumber());
        }


        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.location_image);
        if (dest.hasValidImage()) {
            locationImage.setImageResource(dest.getImageResourceId());
            locationImage.setVisibility(View.VISIBLE);
        } else {
            locationImage.setVisibility(View.GONE);
        }

        return listItemView;
    }


    /**
     * Constructor
     */
    DestinationAdapter(Context context, ArrayList<TourDestination> dest) {
        super(context, 0, dest);
    }

    DestinationAdapter(Context context, ArrayList<TourDestination> dest, int color) {
        super(context, 0, dest);
        mItemBackgroundColor = color;
    }

}
