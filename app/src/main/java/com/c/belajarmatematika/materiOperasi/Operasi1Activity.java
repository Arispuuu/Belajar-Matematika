package com.c.belajarmatematika.materiOperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.Kuis.Skuis1Activity;
import com.c.belajarmatematika.Kuis3.Skuis3Activity;
import com.c.belajarmatematika.Kuis4.Skuis4Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityKuisBinding;
import com.c.belajarmatematika.databinding.ActivityOperasi1Binding;
import com.c.belajarmatematika.kuis2.Skuis2Activity;
import com.c.belajarmatematika.matematika.MenuActivity;

public class Operasi1Activity extends AppCompatActivity {

    private ActivityOperasi1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityOperasi1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MenuActivity.class)));
        binding.lanjut.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi2Activity.class)));
    }
}