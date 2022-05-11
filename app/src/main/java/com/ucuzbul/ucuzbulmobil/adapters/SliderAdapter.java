package com.ucuzbul.ucuzbulmobil.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.ucuzbul.ucuzbulmobil.R;

import org.w3c.dom.Text;

public class SliderAdapter extends PagerAdapter {

    Context context;

    int[] items;

    LayoutInflater layoutInflater;

    public SliderAdapter(Context context, int[] items) {
        this.context = context;
        this.items = items;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ConstraintLayout) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = layoutInflater.inflate(R.layout.slider_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.slider_content_img);
        imageView.setImageResource(items[position]);

        TextView textView = (TextView) itemView.findViewById(R.id.slider_content_text);

        container.addView(itemView);


        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
