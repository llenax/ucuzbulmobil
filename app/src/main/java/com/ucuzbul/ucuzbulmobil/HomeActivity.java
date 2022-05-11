package com.ucuzbul.ucuzbulmobil;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ucuzbul.ucuzbulmobil.adapters.SliderAdapter;

public class HomeActivity extends AppCompatActivity {

    ViewPager slider;
    SliderAdapter sliderAdapter;

    int[] sliderItems = { R.drawable.ic_launcher_background, R.drawable.ic_launcher_background };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        slider = (ViewPager) findViewById(R.id.slider);
        sliderAdapter = new SliderAdapter(HomeActivity.this, sliderItems);

        slider.setAdapter(sliderAdapter);

    }
}
