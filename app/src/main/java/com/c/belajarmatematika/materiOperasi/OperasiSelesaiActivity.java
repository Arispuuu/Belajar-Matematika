package com.c.belajarmatematika.materiOperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityOperasi12Binding;
import com.c.belajarmatematika.databinding.ActivityOperasiSelesaiBinding;
import com.c.belajarmatematika.matematika.MenuActivity;

public class OperasiSelesaiActivity extends AppCompatActivity {

    private ActivityOperasiSelesaiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityOperasiSelesaiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MenuActivity.class)));
        binding.lanjut.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi1Activity.class)));
        binding.kembali.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), Operasi17Activity.class)));
    }

}