package com.example.calculatorappchanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numInput1;
    int numInput2;
    String strInput1;
    String strInput2;
    String operation;
    boolean onInpOne = true;

    TextView textViewFirst;
    TextView textViewSecond;
    TextView textViewOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewFirst = findViewById(R.id.textViewInput1);
        textViewSecond = findViewById(R.id.textViewInput2);
        textViewOut = findViewById(R.id.textViewOutput);
    }

    public void onClick(View v){
        //check if button for number one was pressed
        if (v.getId() == R.id.buttonOne){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "1";
                }
                else{
                    strInput1 += "1";
                }

                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "1";
                }
                else{
                    strInput2 += "1";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number two was pressed
        if (v.getId() == R.id.buttonTwo){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "2";
                }
                else{
                    strInput1 += "2";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "2";
                }
                else{
                    strInput2 += "2";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number three was pressed
        if (v.getId() == R.id.buttonThree){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "3";
                }
                else{
                    strInput1 += "3";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "3";
                }
                else{
                    strInput2 += "3";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number four was pressed
        if (v.getId() == R.id.buttonFour){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "4";
                }
                else{
                    strInput1 += "4";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "4";
                }
                else{
                    strInput2 += "4";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number five was pressed
        if (v.getId() == R.id.buttonFive){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "5";
                }
                else{
                    strInput1 += "5";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "5";
                }
                else{
                    strInput2 += "5";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number six was pressed
        if (v.getId() == R.id.buttonSix){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "6";
                }
                else{
                    strInput1 += "6";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "6";
                }
                else{
                    strInput2 += "6";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number seven was pressed
        if (v.getId() == R.id.buttonSeven){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "7";
                }
                else{
                    strInput1 += "7";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "7";
                }
                else{
                    strInput2 += "7";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number eight was pressed
        if (v.getId() == R.id.buttonEight){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "8";
                }
                else{
                    strInput1 += "8";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "8";
                }
                else{
                    strInput2 += "8";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number nine was pressed
        if (v.getId() == R.id.buttonNine){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "9";
                }
                else{
                    strInput1 += "9";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "9";
                }
                else{
                    strInput2 += "9";
                }
                textViewSecond.setText(strInput2);
            }
        }

        //check if button for number zero was pressed
        if (v.getId() == R.id.buttonZero){
            //if user is entering the first input
            if(onInpOne){
                //check for null and clear
                if(strInput1==null || strInput1=="enter num"){
                    strInput1 = "0";
                }
                else{
                    strInput1 += "0";
                }
                textViewFirst.setText(strInput1);
            }
            //if user is entering the second input
            else{
                if(strInput2==null || strInput2=="enter num"){
                    strInput2 = "0";
                }
                else{
                    strInput2 += "0";
                }
                textViewSecond.setText(strInput2);
            }
        }


        //if any operations button is pressed

        //add
        if(v.getId() == R.id.buttonPlus){
            //switch input from input1 to input2
            onInpOne = false;
            operation = "+";
        }
        //subtract
        if(v.getId() == R.id.buttonMinus){
            //switch input from input1 to input2
            onInpOne = false;
            operation = "-";
        }
        //multiply
        if(v.getId() == R.id.buttonMultiply){
            //switch input from input1 to input2
            onInpOne = false;
            operation = "*";
        }
        //divide
        if(v.getId() == R.id.buttonDivide){
            //switch input from input1 to input2
            onInpOne = false;
            operation = "/";
        }


        //DELETE
        if(v.getId() == R.id.buttonDelete){
            //check which input the user is on
            if(onInpOne){
                strInput1 = "enter num";
            }
            else{
                strInput2 = "enter num";
            }
        }

        //equals
        if(v.getId() == R.id.buttonEquals){
            numInput1 = Integer.parseInt(strInput1);
            numInput2 = Integer.parseInt(strInput2);
            double result = calculation(numInput1, numInput2, operation);
            String strRes = new Double(result).toString();
            textViewOut.setText(strRes);
        }

        //add a clear everything button?
    }


    public double calculation(int a, int b, String op){
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
        return res;
    }

}