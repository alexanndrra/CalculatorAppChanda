package com.example.calculatorappchanda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int numInput1;
    int numInput2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v){

    }

    //which number is pressed
    public void numSelected(View v){

    }



//    public double operation(double a, double b, String op){
//        double res = 0;
//        if(op.equals("+")){
//            res = a+b;
//        }
//        else if(op.equals("-")){
//            res = a-b;
//        }
//        else if(op.equals("*")){
//            res = a*b;
//        }
//        else if(op.equals("/")){
//            res = a/b;
//        }
//        else{
//            return -0;
//        }
//        return res;
//    }

}