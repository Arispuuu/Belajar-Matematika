package com.c.belajarmatematika.menukuis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis42.KuisSkala42Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySkuism1Binding;
import com.c.belajarmatematika.databinding.ActivitySkuissk1Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuissk1Activity extends AppCompatActivity {

    private ActivitySkuissk1Binding binding;
    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuissk1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        suarabtn = MediaPlayer.create(getBaseContext(), R.raw.btn);

    }

    private void setListeners() {

        binding.mulai.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisSkala42Activity.class));
        });

        binding.imageBack.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisActivity.class));
        });

    }
}