package com.c.belajarmatematika.Kuis3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.KuizOperasiActivity;
import com.c.belajarmatematika.databinding.ActivitySkuis3Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuis3Activity extends AppCompatActivity {

    private ActivitySkuis3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuis3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.mulai.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisKecepatan1Activity.class)));
        binding.imageBack.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisActivity.class)));
    }
}