package com.krisp.tbd.icivic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button login = (Button)findViewById(R.id.button1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myintent = new Intent(WelcomeActivity.this, Login.class);
                startActivity(myintent);
            }
        });

        //skip button temporary
        Button signup = (Button)findViewById(R.id.skip);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(WelcomeActivity.this, Register.class);
                startActivity(change);
            }
        });
    }


}
