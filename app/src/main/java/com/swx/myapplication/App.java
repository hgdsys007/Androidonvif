package com.swx.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by Android Studio.
 * User: 身为行
 * Date: 2020/3/16
 * Time: 14:13
 * Describe: ${as}
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
