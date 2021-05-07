package com.soapgu.hellohilt;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public class VMModule {
    @Provides
    public String GetWelcomeMessage() {
        return "---Welcome from VMModule---";
    }
}
