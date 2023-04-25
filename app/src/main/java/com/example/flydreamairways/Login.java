package com.example.flydreamairways;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flydreamairways.databinding.ActivityMainBinding;

public class Login extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
