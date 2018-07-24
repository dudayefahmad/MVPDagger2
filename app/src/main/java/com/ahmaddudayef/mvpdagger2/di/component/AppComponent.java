package com.ahmaddudayef.mvpdagger2.di.component;

import android.app.Application;
import android.content.Context;

import com.ahmaddudayef.mvpdagger2.InitApplication;
import com.ahmaddudayef.mvpdagger2.di.module.AppModule;
import com.ahmaddudayef.mvpdagger2.di.module.ContextModule;
import com.ahmaddudayef.mvpdagger2.di.module.DataModule;
import com.ahmaddudayef.mvpdagger2.model.Model;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Singleton
@Component(modules = {AppModule.class, DataModule.class, ContextModule.class})
public interface AppComponent {
    void inject(InitApplication initApplication);

    Context getContext();

    Model getFindItemsInteractor();

    Application getApplication();
}
