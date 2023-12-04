package com.example.catalogue_application;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

public class detail_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        TextView txtv = findViewById(R.id.txtview);
        String imgUrl = getIntent().getStringExtra("imageUrl");
        String animalName = getIntent().getStringExtra("name");


        ImageView imageView = findViewById(R.id.imageView);
        switch (animalName) {
            case "Lion":
                txtv.setText("This is a Lion!\nLions are majestic wild cats known for their manes.");
                break;
            case "Zebra":
                txtv.setText("This is a Zebra!\nZebras are known for their black and white stripes.");
                break;
            case "Tiger":
                txtv.setText("This is a Tiger!\nTigers are powerful predators with distinctive stripes.");
                break;
            case "Dog":
                txtv.setText("This is a Dog!\nDogs are loyal and friendly companions to humans.");
                break;
            default:
                txtv.setText("This is an unknown animal!");
                break;
        }

        Picasso.get().load(imgUrl).into(imageView);
    }


}
