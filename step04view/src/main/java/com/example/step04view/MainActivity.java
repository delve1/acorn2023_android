package com.example.step04view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼의 참조값 얻어오기
        Button sendBtn=findViewById(R.id.sendBtn);
        //버튼에 클릭 리스너 등록하기
        sendBtn.setOnClickListener(v->{
            //v 는 View type 이고 이벤트가 일어난 View(Button) 의 참조값이 전달된다.
            //1. EditText 에 입력한 문자열을 읽어와서
            EditText inputText=findViewById(R.id.inputText);
            String msg=inputText.getText().toString();
            //2. Toast(가벼운 메세지) 메세지로 띄우기
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

            //3. TextView 의 참조값 얻어와서
            TextView textView=findViewById(R.id.textView);
            //4. TextView 에 띄우기
            textView.setText(msg);
        });
    }
}