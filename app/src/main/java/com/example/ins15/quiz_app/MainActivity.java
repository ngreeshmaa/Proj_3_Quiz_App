package com.example.ins15.quiz_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score;
    private RadioButton question1AnswerRadio, question2AnswerRadio;
    private CheckBox question1Answer1Check, question1Answer2Check, question1Answer3Check, question1Answer4Check;
    private EditText question1AnswerEdit, question2AnswerEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question1AnswerRadio = findViewById(R.id.radioButtonQ13);
        question2AnswerRadio = findViewById(R.id.radioButtonQ24);
        question1Answer1Check = findViewById(R.id.checkBox1);
        question1Answer3Check = findViewById(R.id.checkBox3);
        question1Answer4Check = findViewById(R.id.checkBox4);
        question1Answer2Check = findViewById(R.id.checkBox2);
        question1AnswerEdit = findViewById(R.id.editText1);
        question2AnswerEdit = findViewById(R.id.editText2);
    }


    /**
     * method to calculate the score
     **/
    public void submit(View view) {
        if (question1Answer1Check.isChecked() && question1Answer2Check.isChecked() && !question1Answer3Check.isChecked() && !question1Answer4Check.isChecked()) {
            score++;
        }
        if (question1AnswerRadio.isChecked()) {
            score++;
        }
        if (question1AnswerEdit.getText().toString().equals("219")) {
            score++;
        }
        if (question2AnswerEdit.getText().toString().toLowerCase().trim().equals("belgium")) {
            score++;
        }
        if (question2AnswerRadio.isChecked()) {
            score++;
        }

        String result = "Your score is " + score;
        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        score = 0;
    }

}
