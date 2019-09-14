package com.santos.santos_labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dispPlaces(View v){
        Intent i = new Intent(getApplicationContext(), Places.class);
        startActivity(i);
    }

    public void logDisp(View v) {
        super.onResume();
        Intent i = new Intent(this, MyService.class) ;
        startService(i);
    }


}
