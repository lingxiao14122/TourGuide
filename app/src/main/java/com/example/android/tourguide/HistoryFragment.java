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

public class HistoryFragment extends Fragment {

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
        locations.add(new Location(getString(R.string.fort_cornwallis), getString(R.string.jalan_tun_syed_sheh_barakbah), getString(R.string.fort_cornwallis_desc)));
        locations.add(new Location(getString(R.string.cheong_fatt_tze_mansion), getString(R.string.lebuh_leith), getString(R.string.cheong_fatt_tze_mansion_desc)));
        locations.add(new Location(getString(R.string.bishop_street), getString(R.string.george_town), getString(R.string.bishop_street_desc)));
        locations.add(new Location(getString(R.string.clan_jetties_of_penang), getString(R.string.pengkalan_weld), getString(R.string.clan_jetties_of_penang_desc)));
        locations.add(new Location(getString(R.string.queen_victoria_memorial_clock_tower), getString(R.string.lebuh_light), getString(R.string.queen_victoria_memorial_clock_tower_desc)));
        locations.add(new Location(getString(R.string.penang_state_museum_and_art_gallery), getString(R.string.lebuh_farquhar), getString(R.string.penang_state_museum_and_art_gallery_desc)));
        locations.add(new Location(getString(R.string.penang_war_museum), getString(R.string.jalan_batu_maung), getString(R.string.penang_war_museum_desc)));
        locations.add(new Location(getString(R.string.pinang_peranakan_mansion), getString(R.string.church_st), getString(R.string.pinang_peranakan_mansion_desc)));
        locations.add(new Location(getString(R.string.leong_san_tong_khoo_kongsi), getString(R.string.cannon_square), getString(R.string.leong_san_tong_khoo_kongsi_desc)));
        locations.add(new Location(getString(R.string.kek_lok_si_temple), getString(R.string.tingkat_lembah_ria_1), getString(R.string.kek_lok_si_temple_desc)));
        mRecyclerView.setAdapter(new LocationAdapter(locations));
    }
}