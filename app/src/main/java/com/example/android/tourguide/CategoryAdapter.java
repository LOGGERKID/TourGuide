package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context mContext, FragmentManager fm) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new AdventureFragment();
        else if (position == 1) return new HeritageFragment();
        else if (position == 2) return new MuseumFragment();
        else if (position == 3) return new ParkFragment();
        else return new PilgrimFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return mContext.getString(R.string.adevnture);
        else if (position == 1) return mContext.getString(R.string.heritage);
        else if (position == 2) return mContext.getString(R.string.museum);
        else if (position == 3) return mContext.getString(R.string.park);
        else return mContext.getString(R.string.pilgrim);

    }

}
