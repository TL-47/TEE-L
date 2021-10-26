package com.example.tp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnok = findViewById(R.id.btnok);
        TextView txt1 = findViewById(R.id.txt1);
        EditText edit1 = findViewById(R.id.edit1);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edit1.getText().toString();
                if (edit1.getText().toString().isEmpty()) {

                    txt1.setText("Please enter your name");
                }


                else {
                    txt1.setText("Welcome, "+name);
                    edit1.setText("");
                }
            }
        });
    }
}