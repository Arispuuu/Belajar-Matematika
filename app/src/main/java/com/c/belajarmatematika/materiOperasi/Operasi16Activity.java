package com.c.belajarmatematika.materiOperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityOperasi12Binding;
import com.c.belajarmatematika.databinding.ActivityOperasi16Binding;
import com.c.belajarmatematika.matematika.MenuActivity;

public class Operasi16Activity extends AppCompatActivity {

    private ActivityOperasi16Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityOperasi16Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MenuActivity.class)));
        binding.lanjut.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi17Activity.class)));
        binding.kembali.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi15Activity.class)));
    }

}