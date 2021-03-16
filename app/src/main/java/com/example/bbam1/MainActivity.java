package com.example.bbam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "서범규의 Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(Tag,"onCreate called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(Tag,"onResume called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(Tag,"onStart called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(Tag,"onStop called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(Tag,"onDestroy called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(Tag,"onPause called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(Tag,"onRestart called!");
    }
}