package com.byl.crashcatch;

import android.app.Application;

import com.crashmanager.CrashManager;

/**
 * Created by baiyuliang on 2016-6-13.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashManager.install(this);
    }
}
