package com.c.belajarmatematika.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.Skuis1Activity;
import com.c.belajarmatematika.Kuis3.Skuis3Activity;
import com.c.belajarmatematika.Kuis4.Skuis4Activity;
import com.c.belajarmatematika.Kuis5.Skuis5Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.activities.MainActivity;
import com.c.belajarmatematika.databinding.ActivityKuisBinding;
import com.c.belajarmatematika.kuis2.Skuis2Activity;

public class KuisActivity extends AppCompatActivity {

    private ActivityKuisBinding binding;
    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityKuisBinding.inflate(getLayoutInflater());
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
            startActivity(new Intent(getApplicationContext(), Skuis1Activity.class));
        });

        binding.KOperasi2.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuis2Activity.class));
        });

        binding.KSkala.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), Skuis3Activity.class));
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