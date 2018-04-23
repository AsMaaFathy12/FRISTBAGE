package com.example.ascom.fristbage.Activites;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ascom.fristbage.Fragments.Acadmy_profile;
import com.example.ascom.fristbage.R;
import com.example.ascom.fristbage.Fragments.frag__player;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

/**
 * Created by ascom on 06/03/2018.
 */

public class baseActivity extends AppCompatActivity {
    private SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.addSpaceItem(new SpaceItem("profile", R.mipmap.profile));
        spaceNavigationView.addSpaceItem(new SpaceItem("About",  R.mipmap.about));
//        spaceNavigationView.addSpaceItem(new SpaceItem("Favourite",  R.drawable.ic_home_blackk));
//        spaceNavigationView.addSpaceItem(new SpaceItem("Settings",  R.drawable.ic_menu_camera));
        spaceNavigationView.showIconOnly();

        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
                  loadFragment(new frag__player());

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                display(itemIndex);

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });



       // display(0);
        loadFragment(new frag__player());



    }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        spaceNavigationView.onSaveInstanceState(outState);
    }

    private void display(int position) {
        switch (position){
            case 0:
                loadFragment(new Acadmy_profile());
                //  Intent i=new Intent(baseActivity.this,MapsActivity.class);
                //startActivity(i);

                break;
            case 1:
              //  Toast.makeText(this, "second", Toast.LENGTH_SHORT).show();


                break;
//            case 2:
//                //loadFragment(new HomeFragment());
//
//                break;
//
//            case 3:
                //loadFragment(new compDetail());
        }
    }
    private void loadFragment(Fragment mfragment)  {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.contentFrame, mfragment);
        ft.commit();
    }
}

