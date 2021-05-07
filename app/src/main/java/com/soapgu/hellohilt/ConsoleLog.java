package com.soapgu.hellohilt;


import com.orhanobut.logger.Logger;

public class ConsoleLog implements ILog {
    @Override
    public void Write(String message) {
        Logger.i( "ConsoleLog Write:%s",message );
    }
}
