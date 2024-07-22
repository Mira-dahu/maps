package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Add_Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_map);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示")
                .setMessage("当您选择开始创建地图后,机器人会通过摄像头遍历探测您的全家.因此,在机器人创建地图前,请整理摆放好您的家中物品,以便机器人顺利完成地图创建.在创建地图的过程中,您可以暂停或取消创建地图.请确保机器人用于足够的电量来创建地图,创建地图所用的时问根据可探测区域的面积而定.大概需要1-2小时.关于创建地图的具体情况,请参阅使用说明<地图创建>.")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .create()
                .show();

    }


    public void startCreateMapActivity(View view) {
        startActivity(new Intent(Add_Map.this, Create_A_Map.class));
    }

    public void startMapSettingsActivity(View view) {
        startActivity(new Intent(Add_Map.this, Map_Settings.class));
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}