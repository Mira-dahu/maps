package com.example.mapmanagementpage;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mapmanagementpage.mapresourcerelated.MapData;
import com.example.mapmanagementpage.mapresourcerelated.MapDataHandleImpl;

public class Other extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void editMapNameTextView(View view){

        final EditText inputServer = new EditText(Other.this);
        AlertDialog.Builder builder = new AlertDialog.Builder(Other.this);
        builder.setTitle("输入新名称").setIcon(android.R.drawable.ic_dialog_info).setView(inputServer).setNegativeButton("取消", null);
        builder.setPositiveButton("确定", (dialog, which) -> ((TextView)findViewById(R.id.name_view)).setText( inputServer.getText().toString()));
        builder.show();
    }

    public void renameMap(String new_name,String uuid){
        MapDataHandleImpl map_data_handel=new MapDataHandleImpl(Other.this);
        MapData map_to_rename=map_data_handel.getByID(uuid);
        if(map_to_rename!=null){
            map_to_rename.name=new_name;
        }
        map_data_handel.setMaps(map_to_rename);
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}