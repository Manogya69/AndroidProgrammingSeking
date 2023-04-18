package com.example.fargmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    @Nullable



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: Oncreate Invoked");
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(TAG, "onCreate: onAttach Invoked");
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onCreate: onStart Invoked");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onCreate: onResume Invoked");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onCreate: onPause Invoked");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onCreate: onDestroyView Invoked");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onCreate: onDestroy Invoked");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onCreate: onDetach Invoked");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onCreate: onActivityCreated Invoked");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onCreate: onStop Invoked");
    }
}
