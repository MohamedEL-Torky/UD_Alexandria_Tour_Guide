package com.example.android.ud_tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SportFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        final ArrayList<Locations> locations = new ArrayList<>();
        locations.add(new Locations(getString(R.string.alex_stadium), getString(R.string.alex_stadium_desc), R.drawable.alex_stadium));


        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(locationAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent descIntent = new Intent(getActivity(), DescriptionActivity.class);
                descIntent.putExtra("LocationName", locations.get(i).getLocationName());
                descIntent.putExtra("LocationDescription", locations.get(i).getmLocationDescription());
                descIntent.putExtra("LocationImage", locations.get(i).getLocationImageID());
                startActivity(descIntent);
            }
        });

        return rootView;
    }
}
