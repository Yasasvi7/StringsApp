package com.example.student.usingstrings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2=findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        btn1=findViewById(R.id.btn1);

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

        btn1.setOnClickListener(new View.OnClickListener(){


            public void onClick(View v){

            Intent i =new Intent(ActivityOne.this,ActivityTwo.class);
            startActivity(i);

        }

    });
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
