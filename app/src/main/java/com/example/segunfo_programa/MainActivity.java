package com.example.segunfo_programa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;

import android.view.View;


public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1= (EditText)findViewById(R.id.num1);
        n2= (EditText)findViewById(R.id.num2);
        res=(TextView)findViewById(R.id.result);
    }
    public void Sum (View view){
        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();
        int num1=Integer.parseInt(valor1);
        int num2=Integer.parseInt(valor2);
        int s= (num1+num2);
        String r= String.valueOf(s);
        res.setText(r);
    }
}