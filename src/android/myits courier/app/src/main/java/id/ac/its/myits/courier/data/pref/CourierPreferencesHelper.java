package id.ac.its.myits.courier.data.pref;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Singleton;

import id.ac.its.myits.courier.data.UserProfile;
import id.ac.its.myits.courier.di.ApplicationContext;
import id.ac.its.myits.courier.di.PreferenceInfo;
import id.ac.its.myits.courier.utils.AppLogger;

@Singleton
public class CourierPreferencesHelper implements PreferencesHelper{
    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    private static final String PREF_KEY_REFRESH_TOKEN = "PREF_KEY_REFRESH_TOKEN";
    private static final String PREF_KEY_TOKEN_TYPE = "PREF_KEY_TOKEN_TYPE";
    private static final String PREF_KEY_TOKEN_EXP = "PREF_KEY_TOKEN_EXP";
    private static final String PREF_KEY_TOKEN_TIMESTAMP = "PREF_KEY_TOKEN_TIMESTAMP";
    private static final String PREF_KEY_TOKEN_SCOPE = "PREF_KEY_TOKEN_SCOPE";
    private static final String PREF_KEY_USERS = "PREF_KEY_USERS";
    private static final String PREF_KEY_CURRENT_USER = "PREF_KEY_CURRENT_USER";
    private static final String PREF_KEY_USERNAME = "PREF_KEY_USERNAME";
    private static final String PREF_KEY_PASSWORD = "PREF_KEY_PASSWORD";

    private final SharedPreferences mPrefs;

    @Inject
    public CourierPreferencesHelper(@ApplicationContext Context context,
                                    @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {

        AppLogger.d("Access token: %s", accessToken);

        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }

    @Override
    public String getRefreshToken() {
        return mPrefs.getString(PREF_KEY_REFRESH_TOKEN, null);
    }

    @Override
    public void setRefreshToken(String refreshToken) {

        AppLogger.d("Refresh token: %s", refreshToken);

        mPrefs.edit().putString(PREF_KEY_REFRESH_TOKEN, refreshToken).apply();
    }

    @Override
    public String getTokenType() {
        return mPrefs.getString(PREF_KEY_TOKEN_TYPE, null);
    }

    @Override
    public void setTokenType(String tokenType) {

        AppLogger.d("Token type: %s", tokenType);

        mPrefs.edit().putString(PREF_KEY_TOKEN_TYPE, tokenType).apply();
    }

    @Override
    public Long getTokenExpiration() {
        return mPrefs.getLong(PREF_KEY_TOKEN_EXP, -1);
    }

    @Override
    public void setTokenExpiration(Long expiresIn) {

        AppLogger.d("Access token expiration: %s", expiresIn);

        mPrefs.edit().putLong(PREF_KEY_TOKEN_EXP, expiresIn).apply();
    }

    @Override
    public Long getTokenTimestamp() {
        return mPrefs.getLong(PREF_KEY_TOKEN_TIMESTAMP, 0);
    }

    @Override
    public void setTokenTimestamp(Long timestamp) {

        Date date = new Date(timestamp);

        AppLogger.d("Access Token Timestamp: %s in millis: %s", date.toString(), timestamp);

        mPrefs.edit().putLong(PREF_KEY_TOKEN_TIMESTAMP, timestamp).apply();
    }

    @Override
    public String getScope() {
        return mPrefs.getString(PREF_KEY_TOKEN_SCOPE, null);
    }

    @Override
    public void setScope(String scope) {
        mPrefs.edit().putString(PREF_KEY_TOKEN_SCOPE, scope).apply();
    }

    @Override
    public String getUsersInJson() {
        return mPrefs.getString(PREF_KEY_USERS, null);
    }

    @Override
    public void setUsersInJson(String users) {
        mPrefs.edit().putString(PREF_KEY_USERS, users).apply();
    }

    @Override
    public Integer getActiveUserId() {
        return mPrefs.getInt(PREF_KEY_CURRENT_USER, -1);
    }

    @Override
    public void setActiveUserId(Integer id) {

        AppLogger.d("Current user id: %s", id);

        mPrefs.edit().putInt(PREF_KEY_CURRENT_USER, id).apply();
    }

    @Override
    public UserProfile getActiveUserProfile() {

        /*String userJson = getUsersInJson();

        if (userJson != null && !userJson.isEmpty()) {
            Gson gson = new Gson();

            EkantorUser[] users = gson.fromJson(userJson, EkantorUser[].class);

            for (EkantorUser u : users) {
                if (u.getId() == this.getActiveUserId()) {
                    return new UserProfile(u.getId(), u.getNama(), u.getEmail(), u.getGrup().getId(),
                            u.getGrup().getNama(), u.getDisposisi(), u.getDelegate(), u.getDefault(),
                            u.getUser_account_id(), u.getAccount_id());

                }
            }
        }*/

        return null;
    }

    @Override
    public void setUsername(String username) {
        mPrefs.edit().putString(PREF_KEY_USERNAME, username).apply();
    }

    @Override
    public String getUsername() {
        return mPrefs.getString(PREF_KEY_USERNAME, null);
    }

    @Override
    public void setPassword(String password) {
        mPrefs.edit().putString(PREF_KEY_PASSWORD, password).apply();
    }

    @Override
    public String getPassword() {
        return mPrefs.getString(PREF_KEY_PASSWORD, null);
    }

    @Override
    public void clearSharedPreferences() {
        mPrefs.edit().clear().commit();
    }
}
