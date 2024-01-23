package com.example.step01hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Log log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // res/log layout/activity_main.xml 문서를 전개해서 화면 구성하기
        setContentView(R.layout.activity_main);
    }

    //버튼을 눌렀을때 호출될 예정인 메소드 만들기
    public void clicked(View v){ //반드시 View type 매개 변수 1개를 선언해야 한다
        log.d("MainActivity", "버튼을 눌렀네?");
    }
}