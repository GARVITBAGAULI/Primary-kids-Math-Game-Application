package com.example.kids_mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView result;
    Button PlayAgain;
    Button exit;
    int score = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.textViewResult);
        PlayAgain = findViewById(R.id.buttonPlayAgain);
        exit = findViewById(R.id.buttonExit);
        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);
        String userScore = String.valueOf(score);
        result.setText("your score : " + userScore);

        PlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}