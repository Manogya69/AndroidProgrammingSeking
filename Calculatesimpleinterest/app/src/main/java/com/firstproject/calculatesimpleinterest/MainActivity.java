package com.firstproject.calculatesimpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateValue(View view){
        EditText principalEditText = findViewById(R.id.principal);
        int principal = Integer.parseInt(principalEditText.getText().toString());

        EditText TimeEditText = findViewById(R.id.time);
        int time = Integer.parseInt(TimeEditText.getText().toString());

        EditText RateEditText = findViewById(R.id.rate);
        int rate = Integer.parseInt(RateEditText.getText().toString());

        Button calculate = findViewById(R.id.calculate);
        TextView resultTextView = findViewById(R.id.calculatedResult);


        int simpleInterest = (principal * rate * time) / 100;

        resultTextView.setText(" = " + simpleInterest);
    }
}