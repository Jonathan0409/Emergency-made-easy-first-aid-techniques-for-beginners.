package com.example.emergency_care_made;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scoreTextView = findViewById(R.id.score_text_view);

        // Retrieve the score from the MainActivity
        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);

        scoreTextView.setText("Your Score: " + score);
    }
}
