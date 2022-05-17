package com.example.calc20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.SubMenuBuilder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button SO, SUB, MU, DI, SAIR;
    private TextView RE;
    private EditText nume01, nume02;
    double res, n1, n2;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nume01 = (EditText) findViewById(R.id.num01);
        nume02 = (EditText) findViewById(R.id.num02);

        RE = (TextView) findViewById(R.id.RU);

        SO = (Button) findViewById(R.id.S);
        SUB = (Button) findViewById(R.id.SU);
        MU = (Button) findViewById(R.id.M);
        DI = (Button) findViewById(R.id.D);
        SAIR = (Button) findViewById(R.id.sair) ;

        SAIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        DI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                dividir();
            }
        });

        MU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                mutiplicar();
            }
        });

        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                subtrair();
            }
        });

        SO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                converter();
                somar();
            }

        });
    }
    public void converter(){
        n1 = Double.parseDouble(nume01.getText().toString());
        n2 = Double.parseDouble(nume02.getText().toString());
    }
    public void somar(){
        res = n1 + n2;
        RE.setText("Resultado:" + res);
    }

    public void subtrair(){
        res = n1 - n2;
        RE.setText("Resultado:" + res);
    }

    public void mutiplicar(){
        res = n1 * n2;
        RE.setText("Resultado:" + res);
    }
    public void dividir(){
        res = n1 / n2;
        RE.setText("Resultado:" + res);
    }

   /* public void verifica(int value) {
        if (nume01.getText().toString().equals("") || nume02.getText().toString().equals("")) {
            RE.setText("Campos vazios");
        }
        else{
            converter();
            if(value == 1){
                somar();
            }
            if(value == 2){
                subtrair();
            }
            if(value == 3){
                mutiplicar();
            }
            if(value == 4){
                dividir();
           */ }



