package com.sun.sqlitetest.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.sun.sqlitetest.entity.ParkingLot;

/**
 * Created by Administrator on 2017/12/29.
 */

@Database(entities = {ParkingLot.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ParkingLotDao parkingLotDao();
}
