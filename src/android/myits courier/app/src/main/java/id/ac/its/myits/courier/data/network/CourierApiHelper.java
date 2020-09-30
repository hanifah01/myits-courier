package id.ac.its.myits.courier.data.network;

import com.rx2androidnetworking.Rx2AndroidNetworking;

import javax.inject.Inject;
import javax.inject.Singleton;

import id.ac.its.myits.courier.data.network.model.courier.UserInfo;
import io.reactivex.Observable;

@Singleton
public class CourierApiHelper implements ApiHelper{
    private ApiHeader apiHeader;

    @Inject
    public CourierApiHelper(ApiHeader apiHeader) {
        this.apiHeader = apiHeader;
    }

    @Override
    public ApiHeader getApiHeader() {
        return apiHeader;
    }

    @Override
    public Observable<UserInfo> doGetUserInfo() {
        return Rx2AndroidNetworking.get(ApiEndpoint.ENDPOINT_MYITS_USERINFO)
                .setTag(MYITS_USER_TAG)
                .addHeaders(this.getApiHeader().getProtectedApiHeader())
                .build()
                .getObjectObservable(UserInfo.class);
    }
}
