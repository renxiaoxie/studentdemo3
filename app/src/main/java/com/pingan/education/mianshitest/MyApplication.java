package com.pingan.education.mianshitest;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;


/**
 * Copyright (C) 2018, PING AN TECHNOLOGIES CO., LTD.
 * MyApplication
 * <p>
 * Description
 *
 * @author RENPENG838
 * @version 1.0
 * <p>
 * Ver 1.0, 2019/5/3, RENPENG838, Create file
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);

    }
}
