package com.tesa.codingchellenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt_first, bt_second, bt_third = findViewById(R.id.bt_third);
    private final Bundle savedInstanceState;

    {

        protected void onCreate (; Bundle Bundle savedInstanceState;
        ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_first = findViewById(R.id.bt_first);
        bt_first.setOnClickListener(this);

        bt_second = findViewById(R.id.bt_second);
        bt_second.setOnClickListener(this);

        bt_third.setOnClickListener(this);
    }
        public void onClick (View v){
        switch (v.getId()) {
            case R.id.bt_first:
                Intent m1 = new Intent(this,
                        FirstActivity.class);
                startActivity(m1);
                break;
            case R.id.bt_second:
                Intent m2 = new Intent(this,
                        SecondActivity.class);
                startActivity(m2);
                break;
            case R.id.bt_third:
                Intent m3 = new Intent(this, ThirdActivity.class);
                startActivity(m3);
                break;

        }
    }
    }

