package com.example.android.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationHolder> {

    List<Location> mLocations;

    public LocationAdapter(List<Location> locations) {
        mLocations = locations;
    }

    @NonNull
    @Override
    public LocationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);
        return new LocationHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationHolder holder, int position) {
        holder.bindLocation(mLocations.get(position));
    }

    @Override
    public int getItemCount() {
        return mLocations.size();
    }


    public static class LocationHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mName;
        TextView mStreetName;
        TextView mDescription;

        public LocationHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.item_image);
            mName = itemView.findViewById(R.id.item_name);
            mStreetName = itemView.findViewById(R.id.item_street_name);
            mDescription = itemView.findViewById(R.id.item_description);
        }

        public void bindLocation(Location location) {
            if (location.hasImage()) {
                // set Image for word
                mImageView.setImageResource(location.getImageRes());
                mImageView.setVisibility(View.VISIBLE);
            } else {
                mImageView.setVisibility(View.GONE);
            }
            mName.setText(location.getName());
            mStreetName.setText(location.getStreetName());
            mDescription.setText(location.getDescription());
        }
    }
}
