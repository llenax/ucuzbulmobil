package com.ucuzbul.ucuzbulmobil.adapters;

import com.ucuzbul.ucuzbulmobil.holders.SliderItemHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ucuzbul.ucuzbulmobil.R;
import com.ucuzbul.ucuzbulmobil.models.SliderItem;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderItemHolder> {

    List<SliderItem> items;

    public SliderAdapter(List<SliderItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SliderItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, parent, false);
        return new SliderItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderItemHolder holder, int position) {
        holder.bindData(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
