package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Num1, Num2;
    Button addition, subtraction, mulltiply, divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addition = findViewById(R.id.add);
        subtraction = findViewById(R.id.sub);
        mulltiply = findViewById(R.id.mul);
        divide = findViewById(R.id.div);
        Num1 = findViewById(R.id.num1);
        Num2 = findViewById(R.id.num2);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Addition();
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtraction();
            }
        });
        mulltiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide();
            }
        });
    }

    public void Addition() {
        double Number1 = Double.parseDouble(Num1.getText().toString());
        double Number2 = Double.parseDouble(Num2.getText().toString());
        double Result = Number1+Number2;
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Result", Result);
        startActivity(i);
    }

    public void Subtraction() {
        double Number1 = Double.parseDouble(Num1.getText().toString());
        double Number2 = Double.parseDouble(Num2.getText().toString());
        double Result = Number1-Number2;
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Result", Result);
        startActivity(i);
    }

    public void Multiply() {
        double Number1 = Double.parseDouble(Num1.getText().toString());
        double Number2 = Double.parseDouble(Num2.getText().toString());
        double Result = Number1*Number2;
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Result", Result);
        startActivity(i);
    }

    public void Divide() {
        double Number1 = Double.parseDouble(Num1.getText().toString());
        double Number2 = Double.parseDouble(Num2.getText().toString());
        double Result = Number1/Number2;
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Result", Result);
        startActivity(i);
    }

}
