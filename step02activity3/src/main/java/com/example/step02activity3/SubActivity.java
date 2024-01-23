package com.example.step02activity3;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Log.e("SubActivity", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("SubActivity", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("SubActivity", "OnDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}