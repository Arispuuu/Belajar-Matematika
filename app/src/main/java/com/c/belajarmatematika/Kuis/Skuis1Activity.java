package com.c.belajarmatematika.Kuis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.databinding.ActivityKuisBinding;
import com.c.belajarmatematika.databinding.ActivitySkuis1Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuis1Activity extends AppCompatActivity {

    private ActivitySkuis1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuis1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.mulai.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuizOperasiActivity.class)));
        binding.imageBack.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisActivity.class)));
    }
}