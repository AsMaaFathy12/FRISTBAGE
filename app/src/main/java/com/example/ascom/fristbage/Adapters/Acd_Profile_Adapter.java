package com.example.ascom.fristbage.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ascom.fristbage.Models.Acadmic_profile_model;
import com.example.ascom.fristbage.R;

import java.util.List;

/**
 * Created by AsMaa on 2/8/2018.
 */

public class Acd_Profile_Adapter extends RecyclerView.Adapter<Acd_Profile_Adapter.MyViewHolder> implements View.OnClickListener {
    private List<Acadmic_profile_model> emodel;
    private Context context;

    public Acd_Profile_Adapter(List<Acadmic_profile_model> feedsList) {

        this.emodel = feedsList;


    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mylist = LayoutInflater.from(parent.getContext()).inflate(R.layout.acadmic_item_player, null);
        MyViewHolder holder = new MyViewHolder(mylist);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Acadmic_profile_model feeds = emodel.get(position);
        holder.Name.setText(feeds.getName());
        holder.Photo.setImageResource(feeds.getImg());


    }

    @Override
    public int getItemCount() {
        return emodel.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView Name;
        public ImageView Photo;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            Name = (TextView) itemView.findViewById(R.id.prof_name);
            Photo = (ImageView) itemView.findViewById(R.id.prof_img);
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked player Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}



