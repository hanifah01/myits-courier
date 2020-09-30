package id.ac.its.myits.courier.data;

import id.ac.its.myits.courier.data.network.ApiHelper;
import id.ac.its.myits.courier.data.pref.PreferencesHelper;

public interface DataManager extends PreferencesHelper, ApiHelper {
    void updateApiHeader(String accessToken);

    void setUserAsLoggedOut();
}
