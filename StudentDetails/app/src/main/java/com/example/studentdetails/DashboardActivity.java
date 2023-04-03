package com.example.studentdetails;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.studentdetails.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.login);


    };

    public void LoginBtnClick(View view){
        Intent intent = new Intent(
                this   ,
                DashboardActivity.class
        );
        startActivity(intent);
    }
}