package com.example.yt.forintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public void onDestroy() {
        Log.d("MyIntentService", "onDestroy executed");
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("MyIntentService", "MyIntentService thread id is : " + Thread.currentThread().getId());
    }
}