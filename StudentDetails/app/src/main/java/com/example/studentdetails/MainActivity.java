package com.example.studentdetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

    }
    public void LoginBtnClick(View view){
        Intent intent = new Intent(
                this   ,
                DashboardActivity.class
        );
        //pulling data from Username Input feild
                EditText usernameEditText = findViewById(R.id.username);

                String userName = usernameEditText.getText().toString();
                intent.putExtra("LOGIN_USERNAME", userName);

        startActivity(intent);
    }

}