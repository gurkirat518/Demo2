package com.akompany.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    EditText eTxt;
    void init(){
        eTxt = (EditText)findViewById(R.id.editText);
        Intent rov=getIntent();
        String barcode=rov.getStringExtra("code");

        eTxt.setText(barcode);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        init();

    }
}
