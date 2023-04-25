package com.example.flydreamairways;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flydreamairways.databinding.ActivityMainBinding;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.flydreamairways.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
