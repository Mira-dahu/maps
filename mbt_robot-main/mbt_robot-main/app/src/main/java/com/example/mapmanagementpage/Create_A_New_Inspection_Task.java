package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Create_A_New_Inspection_Task extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_a_new_inspection_task);
    }

    public void startInspectionMethodActivity(View view) {
        startActivity(new Intent(Create_A_New_Inspection_Task.this, Inspection_Method.class));
    }


    public void destroyTheActivity(View view){
        this.finish();
    }
}