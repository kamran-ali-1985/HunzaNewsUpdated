package com.kamran.hunzanewsupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.kamran.hunzanewsupdated.databinding.ActivitySplashBinding;


public class SplashActivity extends AppCompatActivity {
private ActivitySplashBinding binding;
    private static final long SPLASH_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding=ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(SplashActivity.this, MainActivity.class));

            }
        },SPLASH_DELAY);
    }
}