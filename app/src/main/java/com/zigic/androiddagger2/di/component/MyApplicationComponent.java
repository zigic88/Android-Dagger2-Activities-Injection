package com.zigic.androiddagger2.di.component;

import com.zigic.androiddagger2.MyApplication;
import com.zigic.androiddagger2.di.module.MyApplicationModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by zigic on 29/08/17.
 */

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication>{
}
