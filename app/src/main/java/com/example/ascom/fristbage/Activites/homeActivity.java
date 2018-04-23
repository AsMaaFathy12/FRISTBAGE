package com.example.ascom.fristbage.Activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ascom.fristbage.Adapters.Adapter;
import com.example.ascom.fristbage.R;
import com.example.ascom.fristbage.Models.model;

import java.util.ArrayList;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RecyclerView recyclerView;
        ArrayList<model> newsList = new ArrayList<>();
        Adapter adapter;
            recyclerView = (RecyclerView) findViewById(R.id.recycler_ac1);


            adapter = new Adapter( newsList);


                              //      newsList.add();
                                    recyclerView.setLayoutManager(new LinearLayoutManager(homeActivity.this));
                                    recyclerView.setAdapter(adapter);





                                }
                            }

