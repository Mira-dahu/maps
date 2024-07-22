package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Area_Naming extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_naming);
    }

    public void startAreaAndExclusionZoneManagementActivity(View view) {
        startActivity(new Intent(Area_Naming.this, Area_And_Exclusion_Zone_Management.class));
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}