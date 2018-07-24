package com.ahmaddudayef.mvpdagger2.di.component;

import com.ahmaddudayef.mvpdagger2.MainContract;
import com.ahmaddudayef.mvpdagger2.di.module.MvpModule;
import com.ahmaddudayef.mvpdagger2.di.scope.ActivityScope;
import com.ahmaddudayef.mvpdagger2.view.MainActivity;

import dagger.Component;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = MvpModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

    MainContract.PresenterCallBack getMainPresenter();
}
