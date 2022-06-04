package com.c.belajarmatematika.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.activities.MainActivity;
import com.c.belajarmatematika.bilanganBulat.BilanganBulatActivity;
import com.c.belajarmatematika.databinding.ActivityBilanganBulatBinding;

public class MateriActivity extends AppCompatActivity {

    private ImageButton pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi);

        pindah = findViewById(R.id.imageBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriActivity.this,MenuActivity.class);
                startActivity(intent);

            }
        });

        pindah = findViewById(R.id.btBulat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MateriActivity.this, BilanganBulatActivity.class);
                startActivity(intent);

            }
        });
    }
}