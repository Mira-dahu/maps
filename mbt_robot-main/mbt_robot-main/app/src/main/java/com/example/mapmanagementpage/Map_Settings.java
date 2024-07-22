package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Map_Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_settings);


    }

    public void startActivity3(View view) {
        startActivity(new Intent(Map_Settings.this, Add_Map.class));

    }

    public void startActivity04(View view) {
        startActivity(new Intent(Map_Settings.this, Manage_Maps.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}