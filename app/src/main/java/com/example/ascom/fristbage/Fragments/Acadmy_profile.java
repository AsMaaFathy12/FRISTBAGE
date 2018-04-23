package com.example.ascom.fristbage.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ascom.fristbage.Activites.AddPlayer;
import com.example.ascom.fristbage.Adapters.Acd_Profile_Adapter;
import com.example.ascom.fristbage.Models.Acadmic_profile_model;
import com.example.ascom.fristbage.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ascom on 08/03/2018.
 */

public class Acadmy_profile extends Fragment {
    Context context;
    RecyclerView mRecyclerView;
    List<Acadmic_profile_model> data;
    Acd_Profile_Adapter mAdapter;
    FloatingActionButton add;
//    LinearLayoutManager mLayoutManager;
private GridLayoutManager lLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.acadimic_profile, container, false);
        lLayout = new GridLayoutManager(context, 3);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.recAcadmy);
        add=(FloatingActionButton)view.findViewById(R.id.fab);
       mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(lLayout);
        data=new ArrayList<>();
        data.add(new Acadmic_profile_model("Ahmed", R.mipmap.name));
        data.add(new Acadmic_profile_model("Mohamed", R.mipmap.name));
        data.add(new Acadmic_profile_model(" AsMaa", R.mipmap.name));
        data.add(new Acadmic_profile_model("Noura",R.mipmap.name));
        data.add(new Acadmic_profile_model("Mahmoud", R.mipmap.name));
        data.add(new Acadmic_profile_model("Mohmoud",R.mipmap.name));
//        data.add(new Acadmic_profile_model("Esraa", R.mipmap.name));
//        data.add(new Acadmic_profile_model("Nagah", R.mipmap.name));
//        data.add(new Acadmic_profile_model("Mohamed", R.mipmap.name));
//        data.add(new Acadmic_profile_model("Ahmed", R.mipmap.name));
        mAdapter = new Acd_Profile_Adapter(data);
        mRecyclerView.setAdapter(mAdapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context, AddPlayer.class);
                startActivity(i);
            }
        });
        return view;

    }



    }

