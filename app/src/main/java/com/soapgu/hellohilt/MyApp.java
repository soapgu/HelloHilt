package com.soapgu.hellohilt;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;

import dagger.hilt.android.HiltAndroidApp;


@HiltAndroidApp
public class MyApp extends Application {
    @Override
    public void onCreate() {
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)
                .tag("HelloHilt")
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));
        super.onCreate();
    }
}
