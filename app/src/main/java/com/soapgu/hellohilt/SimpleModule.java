package com.soapgu.hellohilt;

import java.util.Optional;

import dagger.BindsOptionalOf;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityComponent.class)
public class SimpleModule {

    @Provides
    @IntoMap
    @StringKey("One")
    public static IPrint provideIPrint(){
        return new OnePrint();
    }

    @Provides
    @IntoMap
    @StringKey("Two")
    public static IPrint provideAnotherIPrint(){
        return new TwoPrint();
    }


    @Provides
    public ILog provideILog(Lazy<SimpleExport> simpleExport ){
        return new ConsoleLog(simpleExport);
    }

    @IntoSet
    @Provides
    public INullableItem provideFirst(){
        return () -> "---first nullable item---";
    }

    @IntoSet
    @Provides
    public INullableItem provideSecond(){
        return () -> "---second nullable item---";
    }
}
