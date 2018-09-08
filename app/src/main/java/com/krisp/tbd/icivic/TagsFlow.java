package com.krisp.tbd.icivic;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TagsFlow extends AppCompatActivity implements View.OnClickListener {
    Button fork0;
    Button fork1;
    Button fork2;

    Button home1;
    Button home2;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_tags_flow);
        fork0 = (Button) findViewById(R.id.parks);
        fork1 = (Button) findViewById(R.id.city);
        fork2 = (Button) findViewById(R.id.home);

        home1 = (Button) findViewById(R.id.fire);
        home1.setVisibility(View.INVISIBLE);

        home2 = (Button) findViewById(R.id.sewage);
        home2.setVisibility(View.INVISIBLE);

//        txtView = (TextView) findViewById(R.id.alert);
        fork0.setOnClickListener(this);
        fork1.setOnClickListener(this);
        fork2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) { //when user clicks on fork0 or fork1, this method executed
        if (v.getId() == R.id.parks) {
            //code to execute
            txtView.setText("Park!");


        }
        if (v.getId() == R.id.city) {
            //code to execute
            txtView.setText("not park:(");
        }

        if (v.getId() == R.id.home) {
            //code to execute
            fork0.setVisibility(View.GONE);
            fork1.setVisibility(View.GONE);
            fork2.setVisibility(View.GONE);
            home1.setVisibility(View.VISIBLE);
            home2.setVisibility(View.VISIBLE);
        }

    }
}