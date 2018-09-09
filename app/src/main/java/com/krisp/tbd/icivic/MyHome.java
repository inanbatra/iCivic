package com.krisp.tbd.icivic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class MyHome extends AppCompatActivity implements View.OnClickListener{
    Button home0;
    Button home1;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_home);

        home0 = (Button) findViewById(R.id.fire);
        home1 = (Button) findViewById(R.id.sewage);

        txtView = (TextView) findViewById(R.id.alert);

        home0.setOnClickListener(this);
        home1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.fire) {
            //code to execute
            txtView.setText("yuh");
        }
        if(v.getId() == R.id.sewage) {
            //code to execute
            txtView.setText("nuh(");
        }

    }
}

