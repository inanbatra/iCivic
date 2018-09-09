package com.krisp.tbd.icivic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class TagsFlow extends AppCompatActivity implements View.OnClickListener{
    Button fork0;
    Button fork1;
    Button fork2;

    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tags_flow);
        fork0 = (Button) findViewById(R.id.parks);
        fork1 = (Button) findViewById(R.id.city);
        fork2 = (Button) findViewById(R.id.home);

        txtView = (TextView) findViewById(R.id.alert);

        fork0.setOnClickListener(this);
        fork1.setOnClickListener(this);
        fork2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) { //when user clicks on fork0 or fork1, this method executed
        if(v.getId() == R.id.parks) {
            //code to execute
            txtView.setText("Park!");


        }
        if(v.getId() == R.id.city) {
            //code to execute
            txtView.setText("not park:(");
        }

        if(v.getId() == R.id.home) {
            Intent myIntent = new Intent(TagsFlow.this, MyHome.class);
            TagsFlow.this.startActivity(myIntent);
        }

    }
}

