package com.ucuzbul.ucuzbulmobil.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.ucuzbul.ucuzbulmobil.R;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SliderAdapter extends PagerAdapter {

    Context context;

    List<Map<Integer, String>> items;

    LayoutInflater layoutInflater;

    public SliderAdapter(Context context, List<Map<Integer, String>> items) {
        this.context = context;
        this.items = items;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == ((ConstraintLayout) object);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View itemView = layoutInflater.inflate(R.layout.slider_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.slider_content_img);
        imageView.setImageResource(Objects.requireNonNull(getMapPositionIndexVal(position)).getKey());

        TextView textView = (TextView) itemView.findViewById(R.id.slider_content_text);
        textView.setText(Objects.requireNonNull(getMapPositionIndexVal(position)).getValue());

        container.addView(itemView);


        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private Map.Entry<Integer, String> getMapPositionIndexVal(int position) {
        if( items.get(position).entrySet().stream().findFirst().isPresent()) {
            return items.get(position).entrySet().stream().findFirst().get();
        }
        return null;
    }

}
