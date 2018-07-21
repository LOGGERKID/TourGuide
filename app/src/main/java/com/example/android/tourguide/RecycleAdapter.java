package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private ArrayList<Places> placesList;

    public RecycleAdapter(Context mContext, ArrayList<Places> placesList) {
        this.mContext = mContext;
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items, parent, false);

        return new MyViewHolder(itemsView, mContext, placesList);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView placeImage;
        public TextView placeHeading;
        public Context mContext;
        public ArrayList<Places> placesList;

        public MyViewHolder(View itemView, Context mContext, ArrayList<Places> placesList) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.card_image_thumbnail);
            placeHeading = itemView.findViewById(R.id.card_text_heading);
            this.mContext = mContext;
            this.placesList = placesList;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Bundle data = new Bundle();
            //data.putSerializable("Places", placesList.get(getAdapterPosition()));
            Intent intent = new Intent(mContext, DetailedView.class);
            intent.putExtra("Details", placesList.get(getAdapterPosition()));
            this.mContext.startActivity(intent);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        Places place = placesList.get(position);
        myViewHolder.placeImage.setImageResource(place.getmImageResourceId());
        myViewHolder.placeHeading.setText(place.getmHeading());
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }


}
