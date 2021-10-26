package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText text;
EditText text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.txt);
        text1 = findViewById(R.id.txt1);




    }

    public void go(View view) {
    int val1=Integer.parseInt(text.getText().toString());
        int val2 =Integer.parseInt(text.getText().toString());

        Toast.makeText(this, "la valeur "+String.valueOf(val1+val2), Toast.LENGTH_SHORT).show();
    }

}