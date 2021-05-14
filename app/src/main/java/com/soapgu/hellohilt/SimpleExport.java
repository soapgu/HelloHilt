package com.soapgu.hellohilt;

import javax.inject.Inject;

import dagger.hilt.android.scopes.ActivityScoped;

@ActivityScoped
public class SimpleExport {

    @Inject
    public SimpleExport()
    {}

    public String getMessage() {
        return  "this message from SimpleExport";
    }
}
