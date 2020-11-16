package id.ac.its.myits.courier.ui.splash;

import id.ac.its.myits.courier.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {
    void onUserChecking();
}
