package com.c.belajarmatematika.bilanganBulat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.matematika.MateriActivity;
import com.c.belajarmatematika.matematika.MenuActivity;

public class BilanganBulatActivity extends AppCompatActivity {

    private ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bilangan_bulat);

        pindah = findViewById(R.id.imageBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BilanganBulatActivity.this, MateriActivity.class);
                startActivity(intent);

            }
        });

        pindah = findViewById(R.id.bthome);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BilanganBulatActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });
    }
}