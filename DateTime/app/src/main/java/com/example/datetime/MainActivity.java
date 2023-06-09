package com.example.datetime;

import static java.util.Calendar.getInstance;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    String Date;
    TextView GetDateAndTime;
    Button BtnGetDateAndTime;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDateAndTime = findViewById(R.id.getDateAndTime);
        BtnGetDateAndTime = findViewById(R.id.btnGetDateAndTime);
        calendar = getInstance();
        simpleDateFormat = new SimpleDateFormat( "dd-MM-yyy HH:mm:ss");
        Date = simpleDateFormat.format(calendar.getTime());

        BtnGetDateAndTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                GetDateAndTime.setText(Date);
            }
        });


    }
}