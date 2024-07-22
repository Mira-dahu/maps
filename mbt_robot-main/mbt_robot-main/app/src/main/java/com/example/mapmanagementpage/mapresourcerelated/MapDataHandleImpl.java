package com.example.mapmanagementpage.mapresourcerelated;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {MapData.class}, version = 1)
abstract class AppDatabase extends RoomDatabase {
    public abstract MapDataHandle mapDataHandle();
}

public class MapDataHandleImpl implements MapDataHandle {
    private AppDatabase db;

    public MapDataHandleImpl(Context ctx) {
        this.db =  Room.databaseBuilder(ctx,AppDatabase.class, "map_data").allowMainThreadQueries().build();
    }

    @Override
    public MapData getByID(String uuid) {
        return db.mapDataHandle().getByID(uuid);
    }

    @Override
    public void setMaps(MapData map_data) {
        db.mapDataHandle().setMaps(map_data);
    }

    @Override
    public void deleteMap(MapData map_data) {
        db.mapDataHandle().deleteMap(map_data);
    }
}
