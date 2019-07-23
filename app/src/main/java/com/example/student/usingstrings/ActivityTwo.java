package com.example.student.usingstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityTwo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);


        Log.i("Lifecycle", "OnCreat() invoked");

    }

    public void  onStart()
    {
        super.onStart();
        Log.i("Lifecycle", "onStart() invoked");
    }

    public  void onRestart()
    {
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked");
    }
    public void  onResume()
    {
        super.onResume();
        Log.i("Lifecycle","onResume() invoked");
    }

    public void onPause(){

        super.onPause();
        Log.i("Lifecycle","onPause() invoked in Activity 1");

    }

    public void onStop(){

        super.onStop();
        Log.i("Lifecycle","onStop() invoked in Activity 1");

    }
    }

