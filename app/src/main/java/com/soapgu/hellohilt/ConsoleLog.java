package com.soapgu.hellohilt;


import com.orhanobut.logger.Logger;

import javax.inject.Singleton;

import dagger.Lazy;
import dagger.hilt.android.scopes.ActivityScoped;

@ActivityScoped
public class ConsoleLog implements ILog {

    Lazy<SimpleExport> simpleExport;

    public ConsoleLog( Lazy<SimpleExport> simpleExport ){
        this.simpleExport = simpleExport;
    }

    @Override
    public void Write(String message) {
        Logger.i( "ConsoleLog Write:%s",simpleExport.get().getMessage() );
    }
}
