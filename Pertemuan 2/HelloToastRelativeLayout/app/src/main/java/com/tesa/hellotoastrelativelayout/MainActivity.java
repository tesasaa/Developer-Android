package com.tesa.hellotoastrelativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMessage = findViewById(R.id.tv_message);
        Button btToast = findViewById(R.id.button_toast);
        Button btCount = findViewById(R.id.button_count);

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt("mCount");
            tvMessage.setText(String.valueOf(mCount));
        }

        btToast.setOnClickListener(v -> {
            mCount = 0;
            tvMessage.setText(String.valueOf(mCount));
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        });
    }
}