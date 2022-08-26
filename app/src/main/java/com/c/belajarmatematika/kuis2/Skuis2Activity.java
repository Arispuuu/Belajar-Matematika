package com.c.belajarmatematika.kuis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.KuizOperasiActivity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivitySkuis1Binding;
import com.c.belajarmatematika.databinding.ActivitySkuis2Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class Skuis2Activity extends AppCompatActivity {

    private ActivitySkuis2Binding binding;

    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivitySkuis2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        suarabtn = MediaPlayer.create(getBaseContext(),R.raw.btn);
    }

    private void setListeners() {

        binding.mulai.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisOperasi2Activity.class));
        });

        binding.imageBack.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisActivity.class));
        });
    }
}