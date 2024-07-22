package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Manage_Maps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_maps);
    }

    public void startRotationAndDirectionActivity(View view) {
        startActivity(new Intent(Manage_Maps.this, Rotation_And_Direction.class));
    }

    public void startAreaAndExclusionZoneManagementActivity(View view) {
        startActivity(new Intent(Manage_Maps.this, Area_And_Exclusion_Zone_Management.class));
    }

    public void startPointMarkersActivity(View view) {
        startActivity(new Intent(Manage_Maps.this, Point_Markers.class));
    }

    public void startActivity14(View view) {
        startActivity(new Intent(Manage_Maps.this, Patrol_Settings.class));
    }

    public void startMapOtherSettingActivity(View view) {
        startActivity(new Intent(Manage_Maps.this, Other.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}