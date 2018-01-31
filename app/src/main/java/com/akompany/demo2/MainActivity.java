package com.akompany.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2;
    void init(){
        btn1=(Button)findViewById(R.id.ButtonEnd1);
        btn2=(Button)findViewById(R.id.ButtonEnd2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void onClick(View v) {
       int id= v.getId();
       switch (id){
           case R.id.ButtonEnd1:
               Toast.makeText(this,"you presed button left",Toast.LENGTH_LONG).show();
               break;
           case R.id.ButtonEnd2:
               Toast.makeText(this,"you presed button right",Toast.LENGTH_LONG).show();
               break;


       }
    }
}
