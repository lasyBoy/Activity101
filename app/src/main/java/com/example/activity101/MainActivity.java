package com.example.activity101;

import android.app.Activity;
import android.os.Bundle;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends Activity {
    ProgressDialog progressDialog;
    @Override
    protected void onCreate ( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart (){
        super.onStart();
        progressDialog = ProgressDialog.show(this,
                "Please Wait", "Processing...",
                true) ;
        CountDownTimer timer = new CountDownTimer(
                15000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }
    /*public void onStart ()
    {
        super.onStart();
        Log.d(tag, "In the onStart() event");
    }

    public void onRestart ()
    {
        super.onRestart();
        Log.d(tag, "In the onRestart() event");
    }

    public void onResume ()
    {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    public void onPause ()
    {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }

    public void onStop ()
    {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }

    public void onDestroy ()
    {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }
*/
}
