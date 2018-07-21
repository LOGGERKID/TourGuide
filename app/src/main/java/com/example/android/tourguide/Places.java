package com.example.android.tourguide;

import java.io.Serializable;

public class Places implements Serializable {
    private int mImageResourceId;
    private String mHeading;
    private String mRating;


    public Places(int mImageResourceId, String mHeading, String mRating) {
        this.mImageResourceId = mImageResourceId;
        this.mHeading = mHeading;
        this.mRating = mRating;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmRating() {
        return mRating;
    }

    public String getmHeading() {
        return mHeading;
    }
}
