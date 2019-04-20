package com.example.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_del,btn_cln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_del = findViewById(R.id.btn_del);
        btn_cln = findViewById(R.id.btn_cln);

        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_cln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_0){

        }else if (v.getId()==R.id.btn_1){

        }else if (v.getId()==R.id.btn_2){

        }else if (v.getId()==R.id.btn_3){

        }else if (v.getId()==R.id.btn_4){

        }else if (v.getId()==R.id.btn_5){

        }else if (v.getId()==R.id.btn_6){

        }else if (v.getId()==R.id.btn_7){

        }else if (v.getId()==R.id.btn_8){

        }else if (v.getId()==R.id.btn_9){

        }else if (v.getId()==R.id.btn_del){

        }else if (v.getId()==R.id.btn_cln){


        }
    }
}
