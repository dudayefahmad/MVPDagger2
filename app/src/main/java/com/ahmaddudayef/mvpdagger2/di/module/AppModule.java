package com.ahmaddudayef.mvpdagger2.di.module;

import android.app.Application;

import com.ahmaddudayef.mvpdagger2.InitApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class AppModule {
    private InitApplication initApplication;

    public AppModule(InitApplication initApplication){
        this.initApplication = initApplication;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return initApplication;
    }
}
