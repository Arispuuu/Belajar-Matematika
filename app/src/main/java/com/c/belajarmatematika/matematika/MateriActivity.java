package com.c.belajarmatematika.matematika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.activities.BaseActivity;
import com.c.belajarmatematika.activities.MainActivity;
import com.c.belajarmatematika.bilanganBulat.BilanganBulatActivity;
import com.c.belajarmatematika.databinding.ActivityBilanganBulatBinding;
import com.c.belajarmatematika.materiBangun.Bangun1Activity;
import com.c.belajarmatematika.materiKecepatan.Kecepatan1Activity;
import com.c.belajarmatematika.materiOperasi.Operasi1Activity;
import com.c.belajarmatematika.materiSkala.Skala1Activity;

public class MateriActivity extends AppCompatActivity {

    private ImageButton pindah;
    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_materi);

        suarabtn = MediaPlayer.create(getBaseContext(),R.raw.btn);

        pindah = findViewById(R.id.imageBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suarabtn.start();
                Intent intent = new Intent(MateriActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
        pindah = findViewById(R.id.btBulat);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suarabtn.start();
                Intent intent = new Intent(MateriActivity.this, Operasi1Activity.class);
                startActivity(intent);
            }
        });
        pindah = findViewById(R.id.btKecepatan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suarabtn.start();
                Intent intent = new Intent(MateriActivity.this, Kecepatan1Activity.class);
                startActivity(intent);
            }
        });
        pindah = findViewById(R.id.Skala);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suarabtn.start();
                Intent intent = new Intent(MateriActivity.this, Skala1Activity.class);
                startActivity(intent);
            }
        });
        pindah = findViewById(R.id.bangun);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suarabtn.start();
                Intent intent = new Intent(MateriActivity.this, Bangun1Activity.class);
                startActivity(intent);
            }
        });
    }
}