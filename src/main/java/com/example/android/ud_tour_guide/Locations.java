package com.example.android.ud_tour_guide;

public class Locations {
    private String mLocationName;
    private String mLocationDescription;
    private int mLocationImageID = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Locations(String mLocationName, String mLocationDescription, int mLocationImageID) {
        this.mLocationName = mLocationName;
        this.mLocationDescription = mLocationDescription;
        this.mLocationImageID = mLocationImageID;
    }

    public Locations(String mLocationName, String mLocationDescription) {
        this.mLocationDescription = mLocationDescription;
        this.mLocationName = mLocationName;
    }

    public void setLocationImageID(int mLocationImageID) {
        this.mLocationImageID = mLocationImageID;
    }

    public void setLocationName(String mLocationName) {
        this.mLocationName = mLocationName;
    }

    public void setLocationDescription(String mLocationDescription) {
        this.mLocationDescription = mLocationDescription;
    }

    public int getLocationImageID() {
        return mLocationImageID;
    }

    public String getLocationName() {
        return mLocationName;
    }

    public String getmLocationDescription() {
        return mLocationDescription;
    }

    public boolean hasImage() {
        return mLocationImageID != NO_IMAGE_PROVIDED;
    }
}
