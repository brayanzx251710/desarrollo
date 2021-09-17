package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private EditText editTextA;
        private EditText editTextB;
        private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);

        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void sumar(View view){

        double operacion = Double.parseDouble(editTextA.getText().toString()) + Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
    public void resta(View view){

        double operacion = Double.parseDouble(editTextA.getText().toString()) - Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
    public void multiplicacion(View view){

        double operacion = Double.parseDouble(editTextA.getText().toString())  * Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }

    public void division(View view){

        double operacion = Double.parseDouble(editTextA.getText().toString()) / Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion+"");
    }
}