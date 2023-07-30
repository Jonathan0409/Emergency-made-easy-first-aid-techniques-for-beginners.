package com.example.emergency_care_made;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class DashBoard extends AppCompatActivity {

    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        drawerLayout=findViewById(R.id.drawer_layout);

    }

    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }
    public void Clicklogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }
    public  void Clickhome(View view){
        MainActivity.redirectActivity(this,MainActivity.class);
    }
    public  void ClickDashboard(View view){
        recreate();
    }
    public void ClickAboutUs(View view){
        MainActivity.redirectActivity(this, com.example.emergency_care_made.AboutUs.class);
    }
    public  void ClickLogout(View view){
        MainActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}