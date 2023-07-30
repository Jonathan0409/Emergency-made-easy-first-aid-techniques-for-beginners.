package com.example.emergency_care_made;

import androidx.appcompat.app.AppCompatActivity;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class emergency extends AppCompatActivity {

    Button button0;
    private static final int REQUEST_PHONE_CALL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(emergency.this, NearbyHospitalActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onCallButtonClicked(View view) {
        int id = view.getId();
        if (id == R.id.button_1) {
            startDialer("143");
        } else if (id == R.id.button_2) {
            startDialer("117");
        } else if (id == R.id.button_3) {
            startDialer("8711-1001");
        } else if (id == R.id.button_4) {
            startDialer("8931-8101");
        } else if (id == R.id.button_5) {
            startDialer("8911-1406");
        } else if (id == R.id.button_6) {
            startDialer("8927-1541");
        } else if (id == R.id.button_7) {
            startDialer("8929-8958");
        } else if (id == R.id.button_8) {
            startDialer("165-02");
        } else if (id == R.id.button_9) {
            startDialer("09177243682");
        }

        // Add more if-else statements for other buttons
        // else if (id == R.id.button_4) {
        //     startDialer("...");
        // }
        // ...
    }

    private void startDialer(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(intent);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_PHONE_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission granted, start the dialer
                startDialer("143");
            } else {
                // Permission denied, show a toast message
                Toast.makeText(this, "Phone call permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    // Rest of your code for DrawerLayout related methods
    // ...
    // ...
}
