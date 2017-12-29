package com.sun.sqlitetest.service

import android.telecom.Call
import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Administrator on 2017/12/29.
 */

interface MyService {
    @GET("/api/")
    fun getParkingLots(@Path("user") user: String): JsonObject
}