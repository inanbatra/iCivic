////package com.krisp.tbd.icivic;
////
////import android.view.SurfaceView;
////import android.view.SurfaceHolder;
////import android.hardware.Camera;
////import android.content.Context;
////import java.io.IOException;
////import android.util.Log;
////
////public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
////
////
////}
//static final int REQUEST_IMAGE_CAPTURE = 1;
//
//private void dispatchTakePictureIntent() {
//        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
//        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
//        }
//        }
//@Override
//protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//        Bundle extras = data.getExtras();
//        Bitmap imageBitmap = (Bitmap) extras.get("data");
//        mImageView.setImageBitmap(imageBitmap);
//        }
//        }