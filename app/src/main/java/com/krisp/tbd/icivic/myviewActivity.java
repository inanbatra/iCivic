package com.krisp.tbd.icivic;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class myviewActivity extends AppCompatActivity{

    static final int REQUEST_IMAGE_CAPTURE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myview);

        Button ton = (Button)findViewById(R.id.button3);

        ton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bruh = new Intent(myviewActivity.this, TagsFlow.class);
                startActivity(bruh);
            }
        });

    }



}
