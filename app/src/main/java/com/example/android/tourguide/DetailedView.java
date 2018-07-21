package com.example.android.tourguide;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
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
        TextView descriptionHeading = findViewById(R.id.detailedHead);
        TextView ratingText = findViewById(R.id.detailedRating);

        Places receivedPlacesToDisplay = (Places) getIntent().getSerializableExtra("Details");
        mainImage.setImageResource(receivedPlacesToDisplay.getmImageResourceId());
        ratingText.setText(receivedPlacesToDisplay.getmRating());
        descriptionHeading.setText(receivedPlacesToDisplay.getmHeading());

        phoneImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = "+91-8553875642";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);


            }
        });
        locationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }

            }
        });


    }

}
