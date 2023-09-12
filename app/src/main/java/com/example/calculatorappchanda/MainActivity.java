package com.example.calculatorappchanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(View v){
        //get inputs
        EditText num1 = findViewById(R.id.editTextInput);
        EditText num2 = findViewById(R.id.editTextInput2);

        //make inputs uneditable
        String num1String = num1.getText().toString();
        String num2String = num2.getText().toString();

        //turn the strings to doubles for calculations
        double input1 = Double.parseDouble(num1.toString());
        double input2 = Double.parseDouble(num2.toString());


        //get which operation button was pressed

        //calculate
        double output = operation(input1, input2, "+"); //replace "+" with the value from op button




        //sync number buttons


        //work on delete
    }

    public double operation(double a, double b, String op){
        double res = 0;
        if(op.equals("+")){
            res = a+b;
        }
        else if(op.equals("-")){
            res = a-b;
        }
        else if(op.equals("*")){
            res = a*b;
        }
        else if(op.equals("/")){
            res = a/b;
        }
        else{
            return -0;
        }
        return res;
    }
}