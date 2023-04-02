package com.esranur.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberText;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberText= findViewById(R.id.number1text);
        number2Text= findViewById(R.id.number2text);
        resultText= findViewById(R.id.resulttext);

    }
    public void sum(View view){
        if (numberText.getText().toString().matches("" ) ||number2Text.getText().toString().matches(""))
            resultText.setText("Enter Number!");
        else{
            double number1= Double.parseDouble(numberText.getText().toString());
            double number2= Double.parseDouble(number2Text.getText().toString());
            double result= number1+number2;
            resultText.setText("="+result);
        }


    }
    public void deduct(View view){
        if (numberText.getText().toString().matches("" ) ||number2Text.getText().toString().matches(""))
            resultText.setText("Enter Number!");
        else {
            double number1= Double.parseDouble(numberText.getText().toString());
            double number2= Double.parseDouble(number2Text.getText().toString());
            double result= number1-number2;
            resultText.setText("=" + result);
        }

    }
    public void multiply(View view){
            if (numberText.getText().toString().matches("") || number2Text.getText().toString().matches(""))
                resultText.setText("Enter Number!");
            else {
                double number1= Double.parseDouble(numberText.getText().toString());
                double number2= Double.parseDouble(number2Text.getText().toString());
               double result= number1*number2;
               
                resultText.setText("=" + result);

            }
        }
            public void divide (View view){
                if (numberText.getText().toString().matches("") || number2Text.getText().toString().matches(""))
                    resultText.setText("Enter Number!");
                else {
                    double number1= Double.parseDouble(numberText.getText().toString());
                    double number2= Double.parseDouble(number2Text.getText().toString());
                    double result= number1/number2;
                    resultText.setText("=" + result);

                }
            }
        }