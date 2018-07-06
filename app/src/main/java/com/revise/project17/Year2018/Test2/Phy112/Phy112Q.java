package com.revise.project17.Year2018.Test2.Phy112;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.revise.project17.R;

import java.util.Vector;

public class Phy112Q extends AppCompatActivity {
    MediaPlayer bgs;
    Phy112QR qst;
    Button btnext;
    TextView qs;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3;
    Vector<String> questions;
    Vector<String> answers;
    Vector<String> options;

    int i=0;
    public static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        bgs = MediaPlayer.create(this, R.raw.quiz1);
        bgs.setLooping(true);
        bgs.start();

        QuizService quizService = new QuizService();
        quizService.execute("https://api.myjson.com/bins/1cbcz6", "T1MAT1112018");

        btnext = (Button)      findViewById(R.id.next);
        qs     = (TextView)    findViewById(R.id.question);
        rg     = (RadioGroup)  findViewById(R.id.radioGroup);
        rb1    = (RadioButton) findViewById(R.id.radioButton1);
        rb2    = (RadioButton) findViewById(R.id.radioButton2);
        rb3    = (RadioButton) findViewById(R.id.radioButton3);

    }
    public void playNext(View v) {


        RadioButton an = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        String ans = an.getText().toString();
        if(i<questions.size()) {
            if (ans.equals(answers.get(i)))
                score++;
        }

        i++;
        if(i>=questions.size()){
            Intent in = new Intent(getApplicationContext(),Phy112_score.class);
            startActivity(in);
            finish();
        }
        if (i < questions.size())
            displayQuiz(i);
    }


    public void displayQuiz(int i) {
        qs.setText(questions.get(i));
        rb1.setText(options.get(3 * i));
        rb2.setText(options.get(3 * i + 1));
        rb3.setText(options.get(3 * i + 2));
    }


    class QuizService extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... params) {
            try {
                qst       = new Phy112QR(params[0], params[1]);
                questions = qst.getQuestions();
                options   = qst.getOptions();
                answers   = qst.getAnswers();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            displayQuiz(0);
        }
    }

    @Override
    public void onStop(){
        super.onStop();
        bgs.stop();
    }
}
