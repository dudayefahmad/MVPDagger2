package com.ahmaddudayef.mvpdagger2.di.module;

import com.ahmaddudayef.mvpdagger2.model.Model;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class DataModule {
    @Provides
    public Model provideModelClass() {
        return new Model();
    }
}
