package com.example.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ArtFragment extends Fragment {

    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate layout
        View view = inflater.inflate(R.layout.fragment_layout, container, false);

        // setup recycle view
        mRecyclerView = view.findViewById(R.id.recycle_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // populate locations
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.kids_on_a_bike, getString(R.string.kids_on_a_bicycle), getString(R.string.armenian_street), getString(R.string.kids_on_a_bicycle_desc)));
        locations.add(new Location(R.drawable.boy_on_the_bike, getString(R.string.boy_on_the_bike), getString(R.string.ah_quee_street), getString(R.string.boy_on_the_bike_desc)));
        locations.add(new Location(R.drawable.the_old_fisherman, getString(R.string.the_old_fisherman), getString(R.string.balik_pulau), getString(R.string.the_old_fisherman_desc)));
        locations.add(new Location(R.drawable.the_silat_master, getString(R.string.the_silat_master), getString(R.string.balik_pulau), getString(R.string.the_silat_master_desc)));
        locations.add(new Location(R.drawable.children_in_a_boat, getString(R.string.children_in_a_boat), getString(R.string.chew_jetty), getString(R.string.children_in_a_boat_desc)));
        locations.add(new Location(R.drawable.reaching_up, getString(R.string.reaching_up), getString(R.string.cannon_street), getString(R.string.reaching_up_desc)));
        mRecyclerView.setAdapter(new LocationAdapter(locations));
    }
}