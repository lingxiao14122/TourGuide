package com.example.android.tourguide;

import androidx.annotation.DrawableRes;

public class Location {
    private final String name;
    private final String streetName;
    private final String description;
    private int imageRes = -1;

    public Location(@DrawableRes int imageRes, String name, String streetName, String description) {
        this.imageRes = imageRes;
        this.name = name;
        this.streetName = streetName;
        this.description = description;
    }

    public Location(String name, String streetName, String description) {
        this.name = name;
        this.streetName = streetName;
        this.description = description;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasImage() {
        return imageRes != -1;
    }
}
