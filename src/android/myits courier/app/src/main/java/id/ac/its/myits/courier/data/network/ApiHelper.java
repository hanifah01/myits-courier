package id.ac.its.myits.courier.data.network;

import io.reactivex.Observable;

import id.ac.its.myits.courier.data.network.model.courier.UserInfo;

public interface ApiHelper {

    public static final String MYITS_USER_TAG = "user_myits";

    ApiHeader getApiHeader();

    Observable<UserInfo> doGetUserInfo();
}
