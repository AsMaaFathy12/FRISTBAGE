package com.example.ascom.fristbage.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;


import com.example.ascom.fristbage.R;
import com.example.ascom.fristbage.Models.model;

import java.util.List;

/**
 * Created by AsMaa on 2/8/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> implements View.OnClickListener {
    private List<model> emodel;
    private Context context;

    public Adapter(List<model> feedsList) {

        this.emodel = feedsList;



    }
    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View mylist = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider,null);
        MyViewHolder holder=new MyViewHolder(mylist);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        model feeds = emodel.get(position);
        holder.name.setText(feeds.getName());
        holder.video.setVideoPath(feeds.getVideo());
        holder.imgProfile.setImageResource(Integer.parseInt(feeds.getImgprofle()));
        holder.img.setImageResource(Integer.parseInt(feeds.getImg()));


    }

    @Override
    public int getItemCount()
    {
        return emodel.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

         TextView  name;
         ImageView img;
        de.hdodenhof.circleimageview.CircleImageView imgProfile;
         VideoView video;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text_v);
            img = (ImageView) itemView.findViewById(R.id.img_acadimic);
            imgProfile = (de.hdodenhof.circleimageview.CircleImageView) itemView.findViewById(R.id.image);
            video=(VideoView)itemView.findViewById(R.id.video);



        }
        @Override
        public void onClick(View view) {

            int position = (int) view.getTag();
            model feeds = emodel.get(position);

        }
    }


}
