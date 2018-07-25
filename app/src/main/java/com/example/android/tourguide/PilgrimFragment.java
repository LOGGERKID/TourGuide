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
public class PilgrimFragment extends Fragment {


    public PilgrimFragment() {
        // Required empty public constructor
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        ArrayList<Places> placeList = new ArrayList<>();

        placeList.add(new Places(R.drawable.bangalore_bilikal_betta_main, "BILIKAL RANGASWAMY BETTA ", "4.3", getString(R.string.balikal_ranganswamy_betta)));
        placeList.add(new Places(R.drawable.skandagigri, "SKANDAGIRI / KALAVARA DURGA", "4.2", getString(R.string.skandagiri)));
        placeList.add(new Places(R.drawable.kanipakam_kaigal_falls_main, "KAIGAL FALLS / DUMUKURALLU WATERFALLS", "3.9", getString(R.string.kaigal_falls)));
        placeList.add(new Places(R.drawable.shivatemple_main, "SHIVA TEMPLE", "3.1", getString(R.string.shiva_temple)));
        placeList.add(new Places(R.drawable.ulsoorlake_main, "ULSOOR LAKE", "4.6)", getString(R.string.ulsoor_lake)));
        placeList.add(new Places(R.drawable.hesaraghattalake_main, "HESARAGHATTA LAKE", "4.2", getString(R.string.hesarghatta_lake)));

        RecycleAdapter adapter = new RecycleAdapter(getContext(), placeList);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return rootView;

    }
}
