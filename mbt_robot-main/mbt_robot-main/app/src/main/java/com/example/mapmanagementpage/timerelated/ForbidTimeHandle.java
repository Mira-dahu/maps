package com.example.mapmanagementpage.timerelated;

import androidx.room.*;

import com.example.mapmanagementpage.mapresourcerelated.MapData;

@Dao
public interface ForbidTimeHandle {
    @Query("SELECT * FROM TimeTableData WHERE uuid=:name")
    public MapData getByID(String name);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void setMaps(MapData map_data);
    @Delete
    public void deleteMap(MapData map_data);
}