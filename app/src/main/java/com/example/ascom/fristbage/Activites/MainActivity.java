package com.example.ascom.fristbage.Activites;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.ascom.fristbage.R;

public class MainActivity extends AppCompatActivity {

Button login,notnow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
login =(Button)findViewById(R.id.sign_in);
notnow =(Button)findViewById(R.id.not_now);
login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i=new Intent(MainActivity.this,loginActivity.class);
        startActivity(i);
    }
});
        notnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,baseActivity.class);
                startActivity(i);
            }
        });


    }
}
