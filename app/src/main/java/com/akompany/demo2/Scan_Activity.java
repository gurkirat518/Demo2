package com.akompany.demo2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.vision.barcode.Barcode;


import java.util.List;

import info.androidhive.barcode.BarcodeReader;

public class Scan_Activity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener,View.OnClickListener{

Button back;
void init(){
    back=(Button)findViewById(R.id.buttonBack);

    back.setOnClickListener(this);
}


   BarcodeReader barcodeReader;


    Barcode thiscode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_);
        barcodeReader=(BarcodeReader)getSupportFragmentManager().findFragmentById(R.id.barcode_scanner);

        init();
    }


    @Override
    public void onScanned(Barcode barcode) {
      barcodeReader.playBeep();

     final String s=barcode.displayValue;
       runOnUiThread(new Runnable() {
           @Override
           public void run() {
               if(!isFinishing()){
                   new AlertDialog.Builder(Scan_Activity.this)
                   .setTitle("Scan Result").setMessage(s).show();

               }
           }
       });


       /* Intent i= new Intent(Scan_Activity.this,Main3Activity.class);
        i.putExtra("code",barcode.displayValue);
        startActivity(i); */


    }

    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {


    }

    @Override
    public void onScanError(String errorMessage) {

      Toast.makeText(this,"Error",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCameraPermissionDenied() {

        finish();
    }


    @Override
    public void onClick(View view) {
        Intent i1=new Intent(Scan_Activity.this,Main2Activity.class);
        startActivity(i1);
        //change dekh rha hai kya
    }
}