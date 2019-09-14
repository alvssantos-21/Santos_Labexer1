package com.santos.santos_labexer1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("place", "Main Building");
        Log.d("place", "Library");
        Log.d("Place", "Hospital");
        Log.d("Place", "Museum");
    }
}
