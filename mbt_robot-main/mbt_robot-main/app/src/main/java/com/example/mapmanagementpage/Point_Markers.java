package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Point_Markers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point_markers);
    }

    public void startActivity13(View view) {
        startActivity(new Intent(Point_Markers.this, Mark_new_observation_points.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}