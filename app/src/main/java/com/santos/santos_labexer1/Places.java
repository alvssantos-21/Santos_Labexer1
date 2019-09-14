package com.santos.santos_labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
    }
    public void displayMueseum(View v){
        Intent i = new Intent(Intent.ACTION_VIEW) ;
        i.setData(Uri.parse("http://ustmuseum.ust.edu.ph/"));
        startActivity(i);
    }
    public void displayMainb(View v){
        Intent i = new Intent(Intent.ACTION_VIEW) ;
        i.setData(Uri.parse("https://varsitarian.net/20180102/circle/ust-main-building-at-90"));
        startActivity(i);
    }
    public void displayLib(View v){
        Intent i = new Intent(Intent.ACTION_VIEW) ;
        i.setData(Uri.parse("http://library.ust.edu.ph/about-us.html"));
        startActivity(i);
    }
    public void displayHost(View v){
        Intent i = new Intent(Intent.ACTION_VIEW) ;
        i.setData(Uri.parse("http://www.usthospital.com.ph/aboutus"));
        startActivity(i);
    }
    public void displayMactivity(View v){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
