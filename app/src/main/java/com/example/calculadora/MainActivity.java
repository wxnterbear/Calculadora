package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Ma m = new Ma();
    private Button resultadoPagina;
    private Button sum;
    private Button res;
    private Button mult;
    private Button div;
    private Button pot;
    private Button suc;
    private Button fact;
    private EditText num1;
    private EditText num2;
    private TextView name;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = getIntent();


        name = findViewById(R.id.name);

        num1 = findViewById(R.id.dato1);
        num2 = findViewById(R.id.dato2);

        sum = findViewById(R.id.button);
        res = findViewById(R.id.button2);
        mult = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        pot = findViewById(R.id.button5);
        suc = findViewById(R.id.button6);
        fact = findViewById(R.id.button7);


        name.setText("Hola " + i.getStringExtra("name"));

        sum.setOnClickListener(view -> {

            double resultado = m.funcionSuma(Double.parseDouble(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
            nextView(resultado);
        });


        res.setOnClickListener(view -> {

            double resultado = m.funcionResta(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
            nextView(resultado);
        });


        mult.setOnClickListener(view -> {
            double resultado = m.funcionMultiplicacion(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
            nextView(resultado);
        });


        div.setOnClickListener(view -> {
            double resultado = m.funcionDivision(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
            nextView(resultado);
        });


        pot.setOnClickListener(view -> {
            double resultado = m.funcionPotencia(Double.parseDouble(num1.getText().toString()), Double.parseDouble(num2.getText().toString()));
            nextView(resultado);
        });



        fact.setOnClickListener(view -> {
            double resultado = m.funcionFactorial(Double.parseDouble(num1.getText().toString()));
            nextView(resultado);
        });


        suc.setOnClickListener(view -> {
            long resultado = m.funcionSucesion(Long.parseLong(num1.getText().toString()));
            nextView(resultado);
        });
    }
    private void nextView(Double res){
        Intent intent = new Intent(MainActivity.this, Resultado.class);
        intent.putExtra("resultado", res);
        startActivity(intent);

    }
    private void nextView(Long res){
        Intent intent = new Intent(MainActivity.this, Resultado.class);
        intent.putExtra("resultado", res);
        startActivity(intent);

    }





}