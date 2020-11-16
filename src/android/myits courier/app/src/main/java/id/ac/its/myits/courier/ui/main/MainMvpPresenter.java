package id.ac.its.myits.courier.ui.main;

import id.ac.its.myits.courier.ui.base.MvpPresenter;
import id.ac.its.myits.courier.ui.base.MvpView;

public interface MainMvpPresenter <V extends MainMvpView & MvpView> extends MvpPresenter<V> {

    void onLogout();

    void test();
}
