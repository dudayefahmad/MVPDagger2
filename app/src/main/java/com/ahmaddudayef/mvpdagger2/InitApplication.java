package com.ahmaddudayef.mvpdagger2;

import android.app.Application;
import android.content.Context;

import com.ahmaddudayef.mvpdagger2.di.component.AppComponent;
import com.ahmaddudayef.mvpdagger2.di.component.DaggerAppComponent;
import com.ahmaddudayef.mvpdagger2.di.module.AppModule;
import com.ahmaddudayef.mvpdagger2.di.module.ContextModule;
import com.ahmaddudayef.mvpdagger2.di.module.DataModule;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

public class InitApplication extends Application {
    private AppComponent component;

    public static InitApplication get(Context context){
        return (InitApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .contextModule(new ContextModule(this))
                .dataModule(new DataModule())
                .build();
    }

    public AppComponent component() {
        return component;
    }
}
