package com.android.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.ndkdemo.LibNDKDemo;

public class MainActivity extends AppCompatActivity {
    private TextView tvTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvTxt = findViewById(R.id.tv_txt);
        tvTxt.setText(LibNDKDemo.stringFromJNI());
    }
}
