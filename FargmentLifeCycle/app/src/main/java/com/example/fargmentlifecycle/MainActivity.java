package com.example.fargmentlifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }

    public void BlueButtonClicked(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_section, BlueFragment.class, null);
        fragmentTransaction.addToBackStack("Homepage");
        fragmentTransaction.commit();
    }

    public void PinkButtonClicked(View view) {
//        getSupportFragmentManager() FragmentManager
//                .beginTransaction() FragmentTransaction
//                .replace(R.id.fragment_section, PinkFragment.class, null)
//                .addToBackStack("Homepage").commit();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_section, PinkFragment.class, null);
        fragmentTransaction.addToBackStack("Homepage");
        fragmentTransaction.commit();
    }
}