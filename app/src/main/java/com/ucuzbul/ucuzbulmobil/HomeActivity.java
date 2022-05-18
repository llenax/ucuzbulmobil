package com.ucuzbul.ucuzbulmobil;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ucuzbul.ucuzbulmobil.adapters.SliderAdapter;
import com.ucuzbul.ucuzbulmobil.models.SliderItem;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {

    RecyclerView slider;
    SliderAdapter sliderAdapter;

    List<SliderItem> sliderItems = new ArrayList<>();

    public HomeActivity() {
        sliderItems.add(new SliderItem("https://w.wallhaven.cc/full/rd/wallhaven-rdwjj7.jpg", "test1"));
        sliderItems.add(new SliderItem(
                "https://w.wallhaven.cc/futall/z8/wallhaven-z8dg9y.png",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce laoreet interdum finibus. Nunc vitae magna velit. Vivamus non lacus sed sapien ultricies luctus quis id nunc. Cras sodales quam lorem, id ullamcorper libero pharetra eu. Morbi leo velit, elementum eu molestie non, vulputate a tellus. Vivamus blandit posuere lacus quis laoreet."
        ));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        slider = findViewById(R.id.slider);
        sliderAdapter = new SliderAdapter(sliderItems);



        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        slider.setLayoutManager(linearLayoutManager);
        slider.setAdapter(sliderAdapter);

    }
}
