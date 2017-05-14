package com.taxi.Adapter;

import com.taxi.Model.NavigationDetails;
import com.taxi.R;

import java.util.ArrayList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<NavigationDetails> arraylist;

    public NavigationAdapter(Context context, ArrayList<NavigationDetails> arraylist) {
        this.context = context;
        this.arraylist = arraylist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_navigation, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.titleTv.setText(arraylist.get(position).getTitle());
        holder.iconIv.setImageResource(arraylist.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arraylist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTv;
        public ImageView iconIv;

        public MyViewHolder(View itemView) {
            super(itemView);
            titleTv = (TextView) itemView.findViewById(R.id.adapter_nav_title);
            iconIv = (ImageView) itemView.findViewById(R.id.adapter_nav_icon);
        }
    }
}