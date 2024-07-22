package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Patrol_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patrol_settings);
    }

    public void startActivity15(View view) {
        startActivity(new Intent(Patrol_Settings.this, Create_A_New_Inspection_Task.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}