package com.sun.sqlitetest.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.sun.sqlitetest.entity.ParkingLot;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Dao
public interface ParkingLotDao {
    @Query("select * from parkinglot")
    List<ParkingLot> getAll();

    @Insert
    void insertAll(ParkingLot... parkingLots);

    @Update
    void updateParkingLots(ParkingLot... parkingLots);

    @Delete
    void delete(ParkingLot parkingLot);
}
