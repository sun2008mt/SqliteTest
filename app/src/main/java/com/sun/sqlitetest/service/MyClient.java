package com.sun.sqlitetest.service;

import retrofit2.Retrofit;

/**
 * Created by Administrator on 2017/12/29.
 */

public class MyClient {

    public static MyService service() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.geonoon.com:8890")
                .build();

        MyService service = retrofit.create(MyService.class);

        return service;
    }
}
