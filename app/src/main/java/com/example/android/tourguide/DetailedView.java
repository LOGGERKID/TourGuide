package com.example.android.tourguide;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailedView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_view);

        ImageView mainImage = findViewById(R.id.detailedImage);
        ImageView phoneImage = findViewById(R.id.detailedPhone);
        ImageView locationImage = findViewById(R.id.detailedLocation);
        TextView ratingText = findViewById(R.id.detailedRating);
        ArrayList<Places> receivedPlacesToDisplay = new ArrayList<Places>();
        //receivedPlacesToDisplay =getIntent().getExtras("Details");

        phoneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        locationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}
