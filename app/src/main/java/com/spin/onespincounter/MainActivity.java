package com.spin.onespincounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.spin.onespinlab.UinTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UinTest uinTest = new UinTest();
        uinTest.ShowToast(MainActivity.this);

    }
}