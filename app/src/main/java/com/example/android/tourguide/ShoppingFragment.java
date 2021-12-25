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

public class ShoppingFragment extends Fragment {

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
        locations.add(new Location(getString(R.string.gurney_paragon_mall), getString(R.string.gurney_drive), getString(R.string.gurney_paragon_mall_desc)));
        locations.add(new Location(getString(R.string.gurney_plaza), getString(R.string.gurney_drive), getString(R.string.gurney_paragon_mall_desc)));
        locations.add(new Location(getString(R.string.straits_quay), getString(R.string.jalan_seri_tanjung_pinang), getString(R.string.straits_quay_desc)));
        locations.add(new Location(getString(R.string.prangin_mall), getString(R.string.jalan_dr_lim_chwee_leong), getString(R.string.prangin_mall_desc)));
        locations.add(new Location(getString(R.string.first_avenue_penang), getString(R.string.jalan_magazine), getString(R.string.first_avenue_penang_desc)));
        locations.add(new Location(getString(R.string.queensbay_mall), getString(R.string.persiaran_bayan_indah), getString(R.string.queensbay_mall_desc)));
        locations.add(new Location(getString(R.string.design_village_penang), getString(R.string.jalan_cassia_barat_2), getString(R.string.design_village_penang_desc)));
        locations.add(new Location(getString(R.string.penang_times_square), getString(R.string.jalan_dato_keramat), getString(R.string.penang_times_square_desc)));
        locations.add(new Location(getString(R.string.komtar), getString(R.string.penang_road), getString(R.string.komtar_tower_desc)));
        locations.add(new Location(getString(R.string.m_mall_020), getString(R.string.jalan_dato_keramat), getString(R.string.m_mall_020_desc)));
        mRecyclerView.setAdapter(new LocationAdapter(locations));
    }
}