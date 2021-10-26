package com.example.controlbahich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nom,vol,date;
    Button ajouter, modifier, supprimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nomtxt);
        vol = findViewById(R.id.voltxt);
        date = findViewById(R.id.datetxt);
        ajouter = findViewById(R.id.ajouter);
        modifier = findViewById(R.id.modifier);
        supprimer = findViewById(R.id.supprimer);

    }


}