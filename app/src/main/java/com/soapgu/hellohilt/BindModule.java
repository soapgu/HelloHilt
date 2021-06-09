package com.soapgu.hellohilt;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

@Module
@InstallIn(ActivityComponent.class)
public abstract class BindModule {
    @BindsOptionalOf
    public abstract ILog bindILog();
}
