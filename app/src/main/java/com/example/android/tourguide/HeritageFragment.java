package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HeritageFragment extends Fragment {
    public HeritageFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        ArrayList<Places> placeList = new ArrayList<>();

        placeList.add(new Places(R.drawable.bangalore_avani_main, "AVANI", "2.9", getString(R.string.avani)));
        placeList.add(new Places(R.drawable.bangalorepalace_main, "BANGALORE PALACE", "4.0", getString(R.string.bangalore_palace)));
        placeList.add(new Places(R.drawable.tipuspalace_main, "TIPU SULTHAN\'s PALACE", "3.6", getString(R.string.tipu_sulthans_fort)));
        placeList.add(new Places(R.drawable.tipufort_main, "THE TIPU\'s FORT", "4.5", getString(R.string.tipu_fort)));
        placeList.add(new Places(R.drawable.highcourt_main, "ULSOOR LAKE", "4.1)", getString(R.string.high_court)));

        RecycleAdapter adapter = new RecycleAdapter(getContext(), placeList);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
