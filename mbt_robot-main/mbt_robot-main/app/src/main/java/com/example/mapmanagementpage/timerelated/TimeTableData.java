package com.example.mapmanagementpage.timerelated;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.annotation.NonNull;
import androidx.room.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class TimeTableData {
    public TimeTableData(String name) {
        this.name=name;
        this.uuid = UUID.randomUUID().toString();
    }

    @Ignore
    public TimeTableData() {
        this.uuid = UUID.randomUUID().toString();
    }

    @PrimaryKey
    @NonNull
    public String uuid;
    @ColumnInfo(name = "name")
    public String name = "";
    @ColumnInfo(name = "add_date")
    public Date add_date = new Date();
    @ColumnInfo(name = "routine_task_time")
    public String task_time="";
}
