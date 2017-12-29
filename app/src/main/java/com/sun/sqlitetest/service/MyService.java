package com.sun.sqlitetest.service;

import com.google.gson.JsonObject;
import com.sun.sqlitetest.entity.ParkingLot;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/12/29.
 */

public interface MyService {
    @GET("/api/{cityCode}/parkingLots")
    Call<JsonObject> getParkingLots(@Path("cityCode") String cityCode);
}
