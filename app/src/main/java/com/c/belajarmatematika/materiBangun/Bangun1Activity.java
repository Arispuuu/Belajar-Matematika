package com.c.belajarmatematika.materiBangun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.activities.MainActivity;
import com.c.belajarmatematika.databinding.ActivityBangun1Binding;
import com.c.belajarmatematika.databinding.ActivityOperasi1Binding;
import com.c.belajarmatematika.matematika.MateriActivity;
import com.c.belajarmatematika.matematika.MenuActivity;

public class Bangun1Activity extends AppCompatActivity implements View.OnClickListener {


    ViewFlipper viewFlipper;
    ImageButton next;
    ImageButton Previous;
    private ActivityBangun1Binding binding;

    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityBangun1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        suarabtn = MediaPlayer.create(getBaseContext(),R.raw.btn);

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);
        next = (ImageButton) findViewById(R.id.lanjut);
        Previous = (ImageButton) findViewById(R.id.kembali);

        next.setOnClickListener(this);
        Previous.setOnClickListener(this);
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), MateriActivity.class));
        });
    }

    @Override
    public void onClick(View v) {
        if (v == next) {
            viewFlipper.showNext();
        }
        else if (v == Previous) {
            viewFlipper.showPrevious();
        }
    }
}