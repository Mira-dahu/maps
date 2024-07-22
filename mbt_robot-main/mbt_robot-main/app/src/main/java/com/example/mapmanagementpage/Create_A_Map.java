package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Create_A_Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_a_map);
    }



    public void startAddMapActivity(View view) {
        startActivity(new Intent(Create_A_Map.this, Add_Map.class));
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}