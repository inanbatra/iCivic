package com.krisp.tbd.icivic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class infogen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infogen);
        String nameform = "    Full Name     : ";
        String mailform = "  Email Address   : ";
        String imgrep =   "Image of Incident : ";
        System.out.printf("%s %s", nameform, );
        System.out.printf("%s %s",mailform,  );
        System.out.printf("%s %s",imgrep,  );

    }
}
