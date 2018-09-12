package com.nicootech.changactivity;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService{

    private static final String TAG="com.nicootech.changactivity";

    public MyIntentService() {
        super("MyIntentService");

    }


    @SuppressLint("LongLogTag")
    @Override
    protected void onHandleIntent(Intent intent) {
        //this is what service does:
        Log.i(TAG,"The service has now started");

    }
}
