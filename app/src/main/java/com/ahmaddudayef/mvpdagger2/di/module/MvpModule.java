package com.ahmaddudayef.mvpdagger2.di.module;

import com.ahmaddudayef.mvpdagger2.MainContract;
import com.ahmaddudayef.mvpdagger2.model.Model;
import com.ahmaddudayef.mvpdagger2.presenter.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */
@Module
public class MvpModule {
    private MainContract.ViewCallBack viewCallBack;

    public MvpModule(MainContract.ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
    }

    @Provides
    public MainContract.ViewCallBack provideView() {
        return viewCallBack;
    }

    @Provides
    public MainContract.PresenterCallBack providePresenter(MainContract.ViewCallBack view,
                                                           Model model) {
        return new MainPresenterImpl(view, model);
    }
}
