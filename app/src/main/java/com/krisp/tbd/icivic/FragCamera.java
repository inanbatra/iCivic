////package com.krisp.tbd.icivic;
////
////import android.hardware.Camera;
////import android.os.Bundle;
////import android.support.design.widget.FloatingActionButton;
////import android.support.design.widget.Snackbar;
////import android.support.v7.app.AppCompatActivity;
////import android.support.v7.widget.Toolbar;
////import android.util.Log;
////import android.view.View;
////import android.hardware.Camera;
////import android.content.Intent;
////import java.io.File;
////import android.net.Uri;
////import android.widget.Toast;
////import android.provider.MediaStore;
////import android.app.Activity;
//
//
//
//public class FragCamera extends AppCompatActivity {
//    static final int REQUEST_IMAGE_CAPTURE = 1;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_camera);
//        if (null == savedInstanceState) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container,Camera2BasicFragment.newInstance())
//                    .commit();
//        }
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
//
//}
