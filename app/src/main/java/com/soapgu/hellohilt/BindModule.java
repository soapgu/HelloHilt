package com.soapgu.hellohilt;

import java.util.Set;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.multibindings.Multibinds;

@Module
@InstallIn(ActivityComponent.class)
public abstract class BindModule {
    @BindsOptionalOf
    public abstract ILog bindILog();

    /**
     * 声明可空集合
     * @return 空集合对象
     */
    @Multibinds
    public abstract Set<INullableItem> setNullableItems();
}
