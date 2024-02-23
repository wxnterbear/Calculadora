package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {
        Ma m = new Ma();
        TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado);
        Intent intent2 = getIntent();
        mensaje = findViewById(R.id.resultadotxt);
        if(intent2.getDoubleExtra("resultado", -0.0) != -0.0){
            mensaje.setText(String.valueOf(intent2.getDoubleExtra("resultado", -0.0)));
        } else if(intent2.getLongExtra("resultado", -1) != -1){
            mensaje.setText(String.valueOf(intent2.getLongExtra("resultado", -1)));
        }

    }
}