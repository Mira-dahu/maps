package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Area_And_Exclusion_Zone_Management extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_and_exclusion_zone_management);
    }

    public void startAreaAndExclusionZoneManagementActivity(View view) {
        startActivity(new Intent(Area_And_Exclusion_Zone_Management.this, Area_Naming.class));
    }

    public void startRegionalMergingAndSplittingActivity(View view) {
        startActivity(new Intent(Area_And_Exclusion_Zone_Management.this, Regional_Merging_And_Splitting.class));
    }

    public void startNewRestrictedAreaActivity(View view) {
        startActivity(new Intent(Area_And_Exclusion_Zone_Management.this, New_Restricted_Area.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}