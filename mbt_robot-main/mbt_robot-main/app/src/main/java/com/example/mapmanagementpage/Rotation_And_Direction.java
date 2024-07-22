package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rotation_And_Direction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation_and_direction);
    }

    public void startRotateMapActivity(View view) {
        startActivity(new Intent(Rotation_And_Direction.this, Rotate_Map.class));
    }

    public void startMarkDirectionActivity(View view) {
        startActivity(new Intent(Rotation_And_Direction.this, Mark_Direction.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}