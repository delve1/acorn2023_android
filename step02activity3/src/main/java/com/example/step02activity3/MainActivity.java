package com.example.step02activity3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "onCreate()");

        Button moveBtn=findViewById(R.id.moveBtn);
        moveBtn.setOnClickListener(v -> {
            Intent intent=new Intent(this, SubActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "OnDestroy()");
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






