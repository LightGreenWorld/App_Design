package com.example.test28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//안녕하세요

        Intent intent = getIntent();
        String str = intent.getExtras().getString("키");
//        EditText editText = findViewById(R.id.edit_text);
//        editText.setText(str);
        ((EditText)findViewById(R.id.edit_text)).setText(str);
    }
}