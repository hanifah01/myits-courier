package id.ac.its.myits.courier.ui.base;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

/**
 * Created by 051100122 on 05/07/2017.
 */

public interface MvpView {

    void showLoading(String title, String message);

    void showLoading(String title, String message, boolean dimmedBackground);

    void hideLoading();

    boolean isNetworkConnected();

    void hideKeyboard();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    void showNoInternetConnectionMessage(@Nullable View.OnClickListener actionListener);

    void showErrorMessage(String errorMsg, @Nullable View.OnClickListener actionListener);

}
