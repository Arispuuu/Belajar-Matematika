package com.c.belajarmatematika.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySignInBinding;
import com.c.belajarmatematika.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListener();
    }

    private void setListener() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
    }
}