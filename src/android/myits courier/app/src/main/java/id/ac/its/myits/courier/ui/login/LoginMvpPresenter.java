package id.ac.its.myits.courier.ui.login;

import id.ac.its.myits.courier.di.PerActivity;
import id.ac.its.myits.courier.ui.base.MvpPresenter;
import id.ac.its.myits.courier.ui.base.MvpView;


public interface LoginMvpPresenter <V extends LoginMvpView & MvpView> extends MvpPresenter<V> {

    void onPersistAccessToken(String accessToken);

    void onUserCheck();

    void onLoginSuccesful();

}
