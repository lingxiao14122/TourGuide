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

public class FoodFragment extends Fragment {

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
        locations.add(new Location(getString(R.string.char_kway_teow), getString(R.string.sian_road), getString(R.string.char_kway_teow_desc)));
        locations.add(new Location(getString(R.string.assam_laksa), getString(R.string.air_itam_market), getString(R.string.assam_laksa_desc)));
        locations.add(new Location(getString(R.string.hokkien_prawn_noodles), getString(R.string.cy_choy_road), getString(R.string.hokkien_prawn_noodles_desc)));
        locations.add(new Location(getString(R.string.cendol), getString(R.string.penang_road), getString(R.string.cendol_desc)));
        locations.add(new Location(getString(R.string.nasi_kandar), getString(R.string.bee_ghah_cafe), getString(R.string.nasi_kandar_desc)));
        locations.add(new Location(getString(R.string.pasembur), getString(R.string.padang_kota_lama), getString(R.string.pasembur_desc)));
        locations.add(new Location(getString(R.string.nasi_lemak), getString(R.string.sri_weld_food_court), getString(R.string.nasi_lemak_desc)));
        locations.add(new Location(getString(R.string.wanton_noodles), getString(R.string.lebuh_chulia), getString(R.string.wanton_noodles_desc)));
        locations.add(new Location(getString(R.string.oyster_omelette), getString(R.string.bayan_baru_market_food_court), getString(R.string.oyster_omelette_desc)));
        locations.add(new Location(getString(R.string.curry_mee), getString(R.string.jalan_air_itam), getString(R.string.curry_mee_desc)));
        locations.add(new Location(getString(R.string.roti_canai), getString(R.string.jalan_transfer), getString(R.string.roti_canai_desc)));
        locations.add(new Location(getString(R.string.lor_bak), getString(R.string.trang_road), getString(R.string.lor_bak_desc)));
        locations.add(new Location(getString(R.string.ikan_bakar), getString(R.string.jalan_butterworth), getString(R.string.ikan_bakar_desc)));
        mRecyclerView.setAdapter(new LocationAdapter(locations));
    }
}