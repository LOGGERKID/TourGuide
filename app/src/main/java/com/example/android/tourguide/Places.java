package com.example.android.tourguide;

import java.io.Serializable;

public class Places implements Serializable {
    private int mImageResourceId;
    private String mHeading;

    public Places(int mImageResourceId, String mHeading) {
        this.mImageResourceId = mImageResourceId;
        this.mHeading = mHeading;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmHeading() {
        return mHeading;
    }
}
