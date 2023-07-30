package com.example.emergency_care_made;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class quiz extends AppCompatActivity {

    CardView Corona, Burn, Asthma, Chocking, Bleeding, Earth, Tsunami, Typhoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Corona = findViewById(R.id.Corona);
        Burn = findViewById(R.id.Burn);
        Asthma = findViewById(R.id.Asthma);
        Chocking = findViewById(R.id.Chocking);
        Bleeding = findViewById(R.id.Bleeding);
        Earth = findViewById(R.id.Earth);
        Tsunami = findViewById(R.id.Tsunami);
        Typhoon = findViewById(R.id.Typhoon);


        Corona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Corona.class);
                startActivity(intent);
            }
        });

        Burn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Burn.class);
                startActivity(intent);
            }
        });

        Asthma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Asthma.class);
                startActivity(intent);
            }
        });

        Chocking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Chocking.class);
                startActivity(intent);
            }
        });

        Bleeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Bleeding.class);
                startActivity(intent);
            }
        });

        Earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Earthquake.class);
                startActivity(intent);
            }
        });

        Tsunami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Tsunami.class);
                startActivity(intent);
            }
        });

        Typhoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(quiz.this, Typhoon.class);
                startActivity(intent);
            }
        });
    }
}