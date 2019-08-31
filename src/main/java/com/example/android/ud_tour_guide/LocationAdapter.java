package com.example.android.ud_tour_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Locations> {

    public LocationAdapter(Context context, ArrayList<Locations> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Locations currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songNameTV = listItemView.findViewById(R.id.location_name);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        songNameTV.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.location_image);
        // Check if an image is provided for this word or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getLocationImageID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
