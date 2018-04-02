package com.example.gab.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    // reporting all activity changes in the states for debugging
    private static final String TAG = "statusChanged!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState() {
        super.onSaveInstanceState();
        log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState() {
        super.onRestoreInstanceState();
        log.i(TAG, "onRestoreInstanceState");
    }

}
