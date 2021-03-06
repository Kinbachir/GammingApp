package com.example.androidappstorepc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                openNextScreen();
                finish();
            }
        }, 3000);
    }
    private void openNextScreen() {
        SharedPreferences shared=getSharedPreferences(Constant.NAMESHARED, Context.MODE_PRIVATE);
        boolean is_connected=shared.getBoolean(Constant.ISCONNECTED,false);
        if (is_connected)
            startActivity(new Intent(this, HomeActivity.class));
        else
            startActivity(new Intent(this, LoginActivity.class));
    }
}