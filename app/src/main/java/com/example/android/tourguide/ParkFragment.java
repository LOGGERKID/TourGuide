package com.example.android.tourguide;


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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        ArrayList<Places> placeList = new ArrayList<>();

        placeList.add(new Places(R.drawable.cariappapark_main, "CARIAPPA PARK", "4.3", getString(R.string.cariappa_m_h)));
        placeList.add(new Places(R.drawable.funworld_main, "FUN WORLD", "4.2", getString(R.string.fun_world)));
        placeList.add(new Places(R.drawable.lalbagh_main, "LALBAGH", "3.9", getString(R.string.lalbagh)));
        placeList.add(new Places(R.drawable.musicalfountain_main, "MUSICAL FOUNTAIN", "3.1", getString(R.string.ind_gan)));
        placeList.add(new Places(R.drawable.wonderla_main, "WONDER LA", "4.6)", getString(R.string.wonderla)));
        RecycleAdapter adapter = new RecycleAdapter(getContext(), placeList);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return rootView;

    }
}
