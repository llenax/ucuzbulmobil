package com.ucuzbul.ucuzbulmobil;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ucuzbul.ucuzbulmobil.adapters.SliderAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    ViewPager slider;
    SliderAdapter sliderAdapter;

    List<Map<String, String>> sliderItems = new ArrayList<>();

    public HomeActivity() {
        sliderItems.add(Collections.singletonMap("https://w.wallhaven.cc/full/rd/wallhaven-rdwjj7.jpg", "test1"));
        sliderItems.add(Collections.singletonMap(
                "https://w.wallhaven.cc/full/z8/wallhaven-z8dg9y.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce laoreet interdum finibus. Nunc vitae magna velit. Vivamus non lacus sed sapien ultricies luctus quis id nunc. Cras sodales quam lorem, id ullamcorper libero pharetra eu. Morbi leo velit, elementum eu molestie non, vulputate a tellus. Vivamus blandit posuere lacus quis laoreet."
        ));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        slider = (ViewPager) findViewById(R.id.slider);
        sliderAdapter = new SliderAdapter(HomeActivity.this, sliderItems);

        slider.setAdapter(sliderAdapter);

    }
}
