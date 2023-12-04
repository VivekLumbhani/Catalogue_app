package com.example.catalogue_application;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.widget.Toast;

import com.bdtopcoder.smart_slider.SliderAdapter;
import com.bdtopcoder.smart_slider.SliderItem;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.smartSlider);

        List<SliderItem> sliderItems = new ArrayList<>();

        sliderItems.add(new SliderItem("https://images.pexels.com/photos/247502/pexels-photo-247502.jpeg?cs=srgb&dl=pexels-pixabay-247502.jpg&fm=jpg", "Lion"));
        sliderItems.add(new SliderItem("https://images.unsplash.com/photo-1598755257130-c2aaca1f061c?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8d2lsZCUyMGFuaW1hbHxlbnwwfHwwfHx8MA%3D%3D", "Zebra"));
        sliderItems.add(new SliderItem("https://images.pexels.com/photos/792381/pexels-photo-792381.jpeg?cs=srgb&dl=pexels-george-desipris-792381.jpg&fm=jpg", "Tiger"));
        sliderItems.add(new SliderItem("https://static.vecteezy.com/system/resources/previews/022/588/202/original/watercolor-cute-dog-cool-superstar-cartoon-animal-character-isolated-transparent-background-ai-generated-png.png", "Dog"));

        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2,5000));

        new SliderAdapter((position, title, view) -> {

            String imageUrl = sliderItems.get(position).getImagesUrl();

            String name = sliderItems.get(position).getTitle();
            Intent intent = new Intent(MainActivity.this, detail_screen.class);
            intent.putExtra("imageUrl", imageUrl);
            intent.putExtra("name", name);
            startActivity(intent);

        });

    }
}
