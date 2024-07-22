package com.example.mapmanagementpage.mapresourcerelated;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.annotation.NonNull;
import androidx.room.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class MapData {
    public MapData(String name) {
        this.uuid = name;
    }
    @Ignore
    public MapData(){
        this.uuid= UUID.randomUUID().toString();
    }
    @PrimaryKey
    @NonNull
    public String uuid;
    @ColumnInfo(name="name")
    public String name="";
    @ColumnInfo(name="add_date")
    public String add_date="";
    @ColumnInfo(name="rotate_angle")
    public float rotate_angle=0;
    @ColumnInfo(name = "map_img_path")
    public String map_image_path="";
    @ColumnInfo(name = "forbidden_area_path")
    public String forbidden_area_image_path="";
    @Ignore
    public Bitmap map_image=null;
    /**
     * Call this function after load from the data base
    **/
    @Ignore void load_bitmap(){
        this.map_image= BitmapFactory.decodeFile(map_image_path);//no specific opt need
    }
}
