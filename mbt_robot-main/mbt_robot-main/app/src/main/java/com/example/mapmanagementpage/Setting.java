package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Setting extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

    }

    public void startMapSettingsActivity(View view) {
        startActivity(new Intent(Setting.this, Map_Settings.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}