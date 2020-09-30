package id.ac.its.myits.courier.data.pref;

import id.ac.its.myits.courier.data.UserProfile;

public interface PreferencesHelper {
    String getAccessToken();

    void setAccessToken(String accessToken);

    String getRefreshToken();

    void setRefreshToken(String refreshToken);

    String getTokenType();

    void setTokenType(String tokenType);

    Long getTokenExpiration();

    void setTokenExpiration(Long expiresIn);

    Long getTokenTimestamp();

    void setTokenTimestamp(Long timestamp);

    String getScope();

    void setScope(String scope);

    String getUsersInJson();

    void setUsersInJson(String users);

    Integer getActiveUserId();

    void setActiveUserId(Integer id);

    UserProfile getActiveUserProfile();

    String getUsername();

    void setUsername(String username);

    String getPassword();

    void setPassword(String password);

    void clearSharedPreferences();
}
