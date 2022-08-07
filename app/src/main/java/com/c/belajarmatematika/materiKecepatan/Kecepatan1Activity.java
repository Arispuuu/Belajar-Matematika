package com.c.belajarmatematika.materiKecepatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityKecepatan1Binding;
import com.c.belajarmatematika.matematika.MateriActivity;
import com.c.belajarmatematika.matematika.MenuActivity;

public class Kecepatan1Activity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;
    ImageButton next;
    ImageButton Previous;
    private ActivityKecepatan1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityKecepatan1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);
        next = (ImageButton) findViewById(R.id.lanjut);
        Previous = (ImageButton) findViewById(R.id.kembali);

        next.setOnClickListener(this);
        Previous.setOnClickListener(this);
    }

    private void setListeners() {
        binding.bthome.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), MateriActivity.class)));
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