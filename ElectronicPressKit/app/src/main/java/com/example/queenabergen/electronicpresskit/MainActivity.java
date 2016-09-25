package com.example.queenabergen.electronicpresskit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "ON CREATE");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ON START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ON PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ON STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ON DESTROY");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ON RESUME");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ON RESTART");
    }
}
/* 1. Activities is the screen. XML code it is called Layouts whereas Java code it is called an activity.
* It describes what you see and do on the screen.
*
* 2.So the manifest has all the essential information for your app in order for it to run. It contains things
* like the package name and the permissions it requires to run the application. There are also system requirements
* such as the API level of the device.
*
* 3.Explicit is seeking a specified component and asking for a specific class to run
* whereas intent the user gives your the information for the system to choose which of the available
* features is best to run for that specific intent.
*
*
* Identify three bugs fixes
*
* I choose to review my Text Based Adventure game with contained a few errors I would like to fix.  When you put in
* the wrong response to the code the game loops back to the beginningSequence. I would also like to change the end
* of the game and give the user an option to play the game again. I also noticed that my game does not contain for loops.
*
*
*
* */

