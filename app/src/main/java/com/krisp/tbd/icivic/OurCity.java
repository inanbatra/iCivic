package com.krisp.tbd.icivic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OurCity extends AppCompatActivity implements View.OnClickListener{
    Button city0;
    Button city1;
    Button city2;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.our_city);

        city0 = (Button) findViewById(R.id.roads);
        city1 = (Button) findViewById(R.id.aes);
        city2 = (Button) findViewById(R.id.water);

        city0.setOnClickListener(this);
        city1.setOnClickListener(this);
        city2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.roads) {
            //code to execute
        }
        if(v.getId() == R.id.aes) {
            //code to execute
        }
        if(v.getId() == R.id.water) {
            //code to execute
        }


    }
}

