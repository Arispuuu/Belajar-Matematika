package com.c.belajarmatematika.Kuis52;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.c.belajarmatematika.Kuis5.KuisBangun1Activity;
import com.c.belajarmatematika.R;
import com.c.belajarmatematika.databinding.ActivityResultBangun51Binding;
import com.c.belajarmatematika.databinding.ActivityResultBangun52Binding;
import com.c.belajarmatematika.matematika.KuisActivity;

public class ResultBangun52Activity extends AppCompatActivity {

    TextView txtCorrectText;
    TextView txtPercentText;
    private int totalQuestions;
    private int finalScore;

    private ActivityResultBangun52Binding binding;

    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityResultBangun52Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

        suarabtn = MediaPlayer.create(getBaseContext(),R.raw.btn);

        txtCorrectText = findViewById(R.id.correct_textview);
        txtPercentText = findViewById(R.id.percent_textview);

        Intent intent = getIntent();
        totalQuestions = intent.getIntExtra("totalQuestions", 0);
        finalScore = intent.getIntExtra("finalScore", 0);

        int mPercentScore = finalScore * 100/ totalQuestions;

        txtPercentText.setText(String.format("%s%%", Integer. toString(Integer.valueOf(mPercentScore))));

        @SuppressLint("StringFormatMatches") String final_score_text = getString(R.string.txtCorrectScore, finalScore, totalQuestions);

        txtCorrectText.setText(final_score_text);
    }

    private void setListeners() {

        binding.exit.setOnClickListener(view -> {
            suarabtn.start();
            startActivity(new Intent(getApplicationContext(), KuisActivity.class));
        });

    }
    public void restartgame52(View view) {
        suarabtn.start();
        startActivity(new Intent(getApplicationContext(), KuisBangun1Activity.class));
    }
}