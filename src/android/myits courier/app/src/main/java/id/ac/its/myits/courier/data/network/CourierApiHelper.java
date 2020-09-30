package id.ac.its.myits.courier.data.network;

import javax.inject.Inject;
import javax.inject.Singleton;

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
}
