package com.c.belajarmatematika.materiOperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityOperasi12Binding;
import com.c.belajarmatematika.databinding.ActivityOperasi17Binding;
import com.c.belajarmatematika.matematika.MenuActivity;

public class Operasi17Activity extends AppCompatActivity {

    private ActivityOperasi17Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityOperasi17Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MenuActivity.class)));
        binding.lanjut.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), OperasiSelesaiActivity.class)));
        binding.kembali.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi16Activity.class)));
    }

}