package com.sun.sqlitetest.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Administrator on 2017/12/29.
 */

@Entity
public class ParkingLot {
    @PrimaryKey
    private int id;

    @ColumnInfo(name = "fid")
    private String fid;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "center")
    private double[] center;

    @ColumnInfo(name = "lon")
    private double lon;

    @ColumnInfo(name = "lat")
    private double lat;

    @ColumnInfo(name = "floors")
    private double[] floors;

    @ColumnInfo(name = "lot_total")
    private int lot_total;

    @ColumnInfo(name = "price")
    private double price;

    @ColumnInfo(name = "price_month")
    private String price_month;

    @ColumnInfo(name = "price_detail")
    private String price_detail;

    @ColumnInfo(name = "type")
    private int type;

    @ColumnInfo(name = "server")
    private int server;

    @ColumnInfo(name = "address")
    private int address;

    @ColumnInfo(name = "has_topo")
    private int has_topo;

    @ColumnInfo(name = "has_map")
    private int has_map;

    @ColumnInfo(name = "bd_id")
    private int bd_id;

    @ColumnInfo(name = "floor_default")
    private int floor_default;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getCenter() {
        return center;
    }

    public void setCenter(double[] center) {
        this.center = center;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double[] getFloors() {
        return floors;
    }

    public void setFloors(double[] floors) {
        this.floors = floors;
    }

    public int getLot_total() {
        return lot_total;
    }

    public void setLot_total(int lot_total) {
        this.lot_total = lot_total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPrice_month() {
        return price_month;
    }

    public void setPrice_month(String price_month) {
        this.price_month = price_month;
    }

    public String getPrice_detail() {
        return price_detail;
    }

    public void setPrice_detail(String price_detail) {
        this.price_detail = price_detail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getServer() {
        return server;
    }

    public void setServer(int server) {
        this.server = server;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getHas_topo() {
        return has_topo;
    }

    public void setHas_topo(int has_topo) {
        this.has_topo = has_topo;
    }

    public int getHas_map() {
        return has_map;
    }

    public void setHas_map(int has_map) {
        this.has_map = has_map;
    }

    public int getBd_id() {
        return bd_id;
    }

    public void setBd_id(int bd_id) {
        this.bd_id = bd_id;
    }

    public int getFloor_default() {
        return floor_default;
    }

    public void setFloor_default(int floor_default) {
        this.floor_default = floor_default;
    }
}
