package com.ucuzbul.ucuzbulmobil.holders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.ucuzbul.ucuzbulmobil.R;
import com.ucuzbul.ucuzbulmobil.models.SliderItem;

public class SliderItemHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public SliderItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.slider_content_img);
        textView = itemView.findViewById(R.id.slider_content_text);
    }

    public void bindData(SliderItem slider) {
        textView.setText(slider.getDescription());
        Picasso.get().load(slider.getImageURL()).into(imageView);
    }
}
