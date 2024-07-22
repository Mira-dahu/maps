package com.example.mapmanagementpage.mapresourcerelated;

import androidx.room.*;

@Dao
public interface MapDataHandle {
    @Query("SELECT * FROM MapData WHERE uuid=:uuid")
    MapData getByID(String uuid);
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void setMaps(MapData map_data);
    @Delete
    void deleteMap(MapData map_data);
}