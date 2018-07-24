package com.ahmaddudayef.mvpdagger2.di.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class ContextModule {
    private Context context;

    public ContextModule(Context context){
        this.context = context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }
}
