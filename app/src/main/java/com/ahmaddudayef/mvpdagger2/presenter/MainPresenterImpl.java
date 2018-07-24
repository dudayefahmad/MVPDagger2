package com.ahmaddudayef.mvpdagger2.presenter;

import com.ahmaddudayef.mvpdagger2.MainContract;
import com.ahmaddudayef.mvpdagger2.model.Model;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

public class MainPresenterImpl implements MainContract.PresenterCallBack,
        MainContract.ModelCallBack.OnFinishedListener {

    private MainContract.ViewCallBack mainView;
    private Model model;

    public MainPresenterImpl(MainContract.ViewCallBack mainView, Model model) {
        this.mainView = mainView;
        this.model = model;
    }

    @Override
    public void onButtonClick() {
        if (mainView != null){
            mainView.showPrograss();
        }

        model.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    public void onFinished(String string) {
        if (mainView != null){
            mainView.setQuote(string);
            mainView.hideProgress();
        }
    }
}
