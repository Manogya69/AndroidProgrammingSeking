package com.example.studentdetails;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.studentdetails.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        //bringing the data entered in the Input Field.
        Intent intent = getIntent();
        String userName = intent.getStringExtra("LOGIN_USERNAME");

        Toast.makeText(getApplicationContext(), "Username Is " + userName, Toast.LENGTH_SHORT).show();



    };


}