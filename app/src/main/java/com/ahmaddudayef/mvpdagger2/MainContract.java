package com.ahmaddudayef.mvpdagger2;

import java.io.StringReader;

/**
 * Created by Ahmad Dudayef on 7/24/2018.
 */

public interface MainContract {
    interface ViewCallBack {
        void showPrograss();

        void hideProgress();

        void setQuote(String string);
    }

    interface ModelCallBack {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener onFinishedListener);
    }

    interface PresenterCallBack {
        void onButtonClick();

        void onDestroy();
    }
}
