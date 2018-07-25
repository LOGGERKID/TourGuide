package com.example.android.tourguide;

import java.io.Serializable;

public class Places implements Serializable {
    private int mImageResourceId;
    private String mHeading;
    private String mRating;
    private String mDescription;


    public Places(int mImageResourceId, String mHeading, String mRating, String mDescription) {
        this.mImageResourceId = mImageResourceId;
        this.mHeading = mHeading;
        this.mRating = mRating;
        this.mDescription = mDescription;
    }

    public String getmDescription() {
        return mDescription;
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
