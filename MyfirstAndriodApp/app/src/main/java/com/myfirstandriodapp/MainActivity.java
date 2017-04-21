package com.myfirstandriodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"On create ----->");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"On Start ----->");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Tag,"On Resume ----->");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"On STOP ----->");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"On Paused ----->");

    }


}
