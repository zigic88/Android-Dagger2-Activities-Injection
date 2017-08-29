package com.zigic.androiddagger2.di.module;

import com.zigic.androiddagger2.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by zigic on 29/08/17.
 */

@Module
public abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();


}
