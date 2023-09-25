package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String s1 = myTextField.getText().toString();
        String s2 = myTextField1.getText().toString();
        Integer first = Integer.parseInt(s1);
        Integer second = Integer.parseInt(s2);
        Integer result = first + second;
        goToActivity(Integer.toString(result));
    }

    public void minusFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String s1 = myTextField.getText().toString();
        String s2 = myTextField1.getText().toString();
        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);
        int result = first - second;
        goToActivity(Integer.toString(result));
    }

    public void multiplyFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String s1 = myTextField.getText().toString();
        String s2 = myTextField1.getText().toString();
        int first = Integer.parseInt(s1);
        int second = Integer.parseInt(s2);
        int result = first * second;
        goToActivity(Integer.toString(result));
    }

    public void divideFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        String s1 = myTextField.getText().toString();
        String s2 = myTextField1.getText().toString();
        double first = Double.parseDouble(s1);
        double second = Double.parseDouble(s2);
        if(second == 0.0) {
            goToActivity("ERROR: Solution does not exist");
        }
        else {
            double result = first / second;
            goToActivity(Double.toString(result));
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("message",s);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}