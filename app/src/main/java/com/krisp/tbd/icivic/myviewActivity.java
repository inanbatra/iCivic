package com.krisp.tbd.icivic;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;


public class myviewActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myview);

        TextView text = (TextView) findViewById(R.id.textView2);
        text.setOnClickListener(new View.OnClickListener(){
            public void onClick(View w){
                Intent intent = new Intent(myviewActivity.this, TagsFlow.class);
                startActivity(intent);
            }
        });


    }



}
