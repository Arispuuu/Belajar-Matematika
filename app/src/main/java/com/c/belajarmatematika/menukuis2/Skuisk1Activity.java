package com.c.belajarmatematika.menukuis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis32.KuisKecepatan32Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySkuisk1Binding;
import com.c.belajarmatematika.databinding.ActivitySkuism1Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuisk1Activity extends AppCompatActivity {

    private ActivitySkuisk1Binding binding;
    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuisk1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        suarabtn = MediaPlayer.create(getBaseContext(), R.raw.btn);

    }

    private void setListeners() {

        binding.mulai.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisKecepatan32Activity.class));
        });

        binding.imageBack.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisActivity.class));
        });

    }
}