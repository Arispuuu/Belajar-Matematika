package com.c.belajarmatematika.Kuis5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.c.belajarmatematika.Kuis.ResultOperasiActivity;
import com.c.belajarmatematika.Kuis3.Kuis3;
import com.c.belajarmatematika.Kuis3.KuisKecepatan1Activity;
import com.c.belajarmatematika.R;

public class KuisBangun1Activity extends AppCompatActivity {

    private ImageView mQuizImage;

    private String mAnswer;

    private  int mScore = 0;

    private int mQuizNum = 1;
    private int QuestionNum = 0;

    private TextView mQuestionView;
    private TextView mQuizNumView;

    private Kuis5 mQuestions = new Kuis5();

    MediaPlayer suarabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kuis_bangun1);

        suarabtn = MediaPlayer.create(getBaseContext(),R.raw.btn);

        mQuestionView = findViewById(R.id.question_textview);
        mQuizNumView = findViewById(R.id.quiznum_textview);

        updateQuestion();

        Button submit = findViewById(R.id.button_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                suarabtn.start();

                if (mQuestions.getType(QuestionNum) == "radiobutton") {

                    if (mQuestions.getCorrectAnswers(QuestionNum).equals(mAnswer)){

                        mScore++;

                        displayToastCorrectAnswer();
                    } else {

                        displayToastWrongAnswer();
                    }
                }

                SystemClock.sleep(1000);

                if (QuestionNum == mQuestions.getLength() -1){

                    Intent intent_result = new Intent(KuisBangun1Activity.this, ResultOperasiActivity.class);
                    intent_result.putExtra("totalQuestions", mQuestions.getLength());
                    intent_result.putExtra("finalScore", mScore);
                    startActivity(intent_result);

                    QuestionNum = 0;
                    mQuizNum = 0;
                    mScore = 0;

                }else {

                    QuestionNum++;
                    mQuizNum++;
                }

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 1000);

                updateQuestion();

            }
        });
    }

    private void displayToastCorrectAnswer(){
        Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
    }
    private void displayToastWrongAnswer(){
        Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();
    }

    private void updateQuestion(){

        LinearLayout answer_layout = findViewById(R.id.answer_layout);
        answer_layout.removeAllViews();
        mAnswer="";

        mQuizNumView.setText(mQuizNum + "/" + String.valueOf(mQuestions.getLength()));
        mQuestionView.setText(mQuestions.getQuestions(QuestionNum));

        if (mQuestions.getType(QuestionNum) == "radiobutton") {

            showRadioButtonAnswers(QuestionNum);

        }

        showMainImage();

    }

    private void showMainImage() {

        mQuizImage = findViewById(R.id.quiz_image);

        String img = mQuestions.getImages(QuestionNum);

        mQuizImage.setImageResource(getResources().getIdentifier(img, "drawable",getPackageName()));

    }

    private void showRadioButtonAnswers(int qnum) {

        final LinearLayout answerLayout = findViewById(R.id.answer_layout);

        RadioGroup rg = new RadioGroup(this);
        rg.setOrientation(RadioGroup.HORIZONTAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        rg.setLayoutParams(lp);
        rg.setPadding(0,5,0,5);
        rg.setHorizontalGravity(1);

        final RadioButton[] rb1 = new RadioButton[3];

        for (int i = 0;i <=2 ; i++) {
            rb1[i] = new RadioButton(this);
            rb1[i].setText(mQuestions.getChoice(qnum) [i]);
            rb1[i].setPadding(0, 0, 100, 0);
            rb1[i].setTextSize(25);
            rb1[i].setId(i);


            rg.addView(rb1[i]);
        }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int Id) {

                mAnswer = mQuestions.getChoice(QuestionNum)[Id];

            }
        });

        answerLayout.addView(rg);

    }


}