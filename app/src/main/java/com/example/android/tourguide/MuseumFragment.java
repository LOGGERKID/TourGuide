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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_view, container, false);
        ArrayList<Places> placeList = new ArrayList<>();

        placeList.add(new Places(R.drawable.govtmuseum_main, "GOVT MUSEUM", "2.3", getString(R.string.gov_mus)));
        placeList.add(new Places(R.drawable.hal_aerospace_museum, "HAL AEROSPACE", "4.6", getString(R.string.hal)));
        placeList.add(new Places(R.drawable.kempegoeda_museum, "KEMPEGOWDA MUSEUM", "4.9", getString(R.string.kemp)));
        placeList.add(new Places(R.drawable.venkatappagallery_main, "VENKATAPPA ART GALLERY", "4.1", getString(R.string.venkatappa)));
        placeList.add(new Places(R.drawable.visweswaraiahmuseum_main, "VISHWESHWARAIAH MUSEUM", "3.6)", getString(R.string.vish_ind)));

        RecycleAdapter adapter = new RecycleAdapter(getContext(), placeList);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return rootView;

    }
}
