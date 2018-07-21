package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter {
    private Context mContext;
    private List<Places> placesList;

    public RecycleAdapter(Context mContext, List<Places> placesList) {
        this.mContext = mContext;
        this.placesList = placesList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_items, parent, false);

        return new MyViewHolder(itemsView);
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

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView placeImage;
        public TextView placeHeading;

        public MyViewHolder(View itemView) {
            super(itemView);
            placeImage = itemView.findViewById(R.id.card_image_thumbnail);
            placeHeading = itemView.findViewById(R.id.card_text_heading);
        }
    }
}
