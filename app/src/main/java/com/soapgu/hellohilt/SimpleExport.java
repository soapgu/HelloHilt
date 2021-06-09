package com.soapgu.hellohilt;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.hilt.android.scopes.ActivityScoped;

@Singleton
public class SimpleExport {

    @Inject
    public SimpleExport()
    {}

    public String getMessage() {
        return  "this message from SimpleExport";
    }
}
