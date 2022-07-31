package com.c.belajarmatematika.Kuis4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.KuizOperasiActivity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySkuis1Binding;
import com.c.belajarmatematika.databinding.ActivitySkuis4Binding;

public class Skuis4Activity extends AppCompatActivity {

    private ActivitySkuis4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuis4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.mulai.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), KuisSkalaActivity.class)));
    }
}