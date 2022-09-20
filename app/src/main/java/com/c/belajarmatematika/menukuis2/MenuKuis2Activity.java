package com.c.belajarmatematika.menukuis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis4.Skuis4Activity;
import com.c.belajarmatematika.Kuis5.Skuis5Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityKuisBinding;
import com.c.belajarmatematika.databinding.ActivityMenuKuis2Binding;
import com.c.belajarmatematika.matematika.MenuActivity;

public class MenuKuis2Activity extends AppCompatActivity {

    private ActivityMenuKuis2Binding binding;
    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMenuKuis2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();


        suarabtn = MediaPlayer.create(getBaseContext(), R.raw.btn);
    }

    private void setListeners() {

        binding.imageBack.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
        });

        binding.KOperasi.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuism1Activity.class));
        });

        binding.KSkala.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuisk1Activity.class));
        });

        binding.KKecepatan.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuis4Activity.class));
        });

        binding.Kbangun.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuis5Activity.class));
        });


    }
}