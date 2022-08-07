package com.c.belajarmatematika.kuis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.KuizOperasiActivity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySkuis1Binding;
import com.c.belajarmatematika.databinding.ActivitySkuis2Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuis2Activity extends AppCompatActivity {

    private ActivitySkuis2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuis2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.mulai.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisOperasi2Activity.class)));
        binding.imageBack.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisActivity.class)));
    }
}