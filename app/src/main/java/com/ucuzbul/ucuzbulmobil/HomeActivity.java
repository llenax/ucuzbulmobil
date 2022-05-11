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

    List<Map<Integer, String>> sliderItems = new ArrayList<>();

    public HomeActivity() {
        sliderItems.add(Collections.singletonMap(R.drawable.ic_launcher_background, "test1"));
        sliderItems.add(Collections.singletonMap(R.drawable.ic_launcher_background, "test2"));
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
