import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ascom.fristbage.R;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;

import android.widget.Toast;
import com.luseen.spacenavigation.SpaceOnClickListener;


public class baseActivity extends AppCompatActivity {
    private SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.addSpaceItem(new SpaceItem("Home", R.drawable.ic_home_blackk));
        spaceNavigationView.addSpaceItem(new SpaceItem("Map",  R.drawable.ic_map_black));
        spaceNavigationView.addSpaceItem(new SpaceItem("Favourite",  R.drawable.ic_home_blackk));
        spaceNavigationView.addSpaceItem(new SpaceItem("Settings",  R.drawable.ic_menu_camera));
        spaceNavigationView.showIconOnly();

        spaceNavigationView.setCentreButtonIconColorFilterEnabled(false);

        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
              //  loadFragment(new HomeFragment());

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                display(itemIndex);

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });



        display(0);



    }




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        spaceNavigationView.onSaveInstanceState(outState);
    }

   private void display(int position) {
       switch (position){
           case 0:
             //  Intent i=new Intent(baseActivity.this,MapsActivity.class);
               //startActivity(i);

               break;
           case 1:
       Toast.makeText(this, "second", Toast.LENGTH_SHORT).show();

               break;
           case 2:
               //loadFragment(new HomeFragment());

               break;

           case 3:
               //loadFragment(new compDetail());
       }
   }
    private void loadFragment(Fragment mfragment)  {
      FragmentManager fragmentManager=getFragmentManager();
      FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        fragmentTransaction.replace(
                R.id.contentFrame,mfragment);
        fragmentTransaction.commit();
    }
}
