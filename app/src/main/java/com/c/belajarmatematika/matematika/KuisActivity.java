package com.c.belajarmatematika.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.Skuis1Activity;
import com.c.belajarmatematika.Kuis3.Skuis3Activity;
import com.c.belajarmatematika.Kuis4.Skuis4Activity;
import com.c.belajarmatematika.databinding.ActivityKuisBinding;
import com.c.belajarmatematika.kuis2.Skuis2Activity;

public class KuisActivity extends AppCompatActivity {

    private ActivityKuisBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityKuisBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.imageBack.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MenuActivity.class)));
        binding.KOperasi.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Skuis1Activity.class)));
        binding.KOperasi2.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Skuis2Activity.class)));
        binding.KSkala.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Skuis3Activity.class)));
        binding.KKecepatan.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Skuis4Activity.class)));

    }
}