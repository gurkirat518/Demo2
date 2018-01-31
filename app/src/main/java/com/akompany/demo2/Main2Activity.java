package com.akompany.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button btn1,btn2;
    void init(){
        btn1=(Button)findViewById(R.id.Cart);
        btn2=(Button)findViewById(R.id.BackButton);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        switch (id){
            case R.id.BackButton:
                Toast.makeText(this,"you presed button left",Toast.LENGTH_LONG).show();
                break;
            case R.id.Cart:
                Toast.makeText(this,"you presed button right",Toast.LENGTH_LONG).show();
                break;


        }
    }
}
