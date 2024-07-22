package com.example.mapmanagementpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mapmanagementpage.mapresourcerelated.MapData;
import com.example.mapmanagementpage.mapresourcerelated.MapDataHandle;
import com.example.mapmanagementpage.mapresourcerelated.MapDataHandleImpl;


public class Rotate_Map extends AppCompatActivity {

    private float rotation_angle=0;
    private MapData chosen_map;
    private MapDataHandle map_data_handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_map);
        //init database
        Context ctx = Rotate_Map.this;
        this.map_data_handler = new MapDataHandleImpl(ctx);
        this.chosen_map =map_data_handler.getByID("test");
        if(this.chosen_map==null){
            this.chosen_map=new MapData("test");
        }
        rotation_angle= this.chosen_map.rotate_angle;
        //apply rotate angle to screen
        ImageView image=(ImageView) findViewById(R.id.mark_obz_background);
        image.setRotation(rotation_angle);
    }

    public void setRotateVal(View view){
        ImageView image=(ImageView) findViewById(R.id.mark_obz_background);
        rotation_angle+=90;
        if(rotation_angle>360){
            rotation_angle-=360;
        }
        image.setPivotX((float)image.getWidth()/2);
        image.setPivotY((float)image.getHeight()/2);//支点在图片中心
        image.setRotation(rotation_angle);
    }

//    public void setRotationValOnTouch(View view){
//        ImageView image=(ImageView) findViewById(R.id.but1);
//    }

    public void saveTheRotate(View view){

        //存入数据
        chosen_map.rotate_angle=rotation_angle;
        map_data_handler.setMaps(chosen_map);
        this.destroyTheActivity(view);
    }

    public void destroyTheActivity(View view){
        this.finish();
    }
}