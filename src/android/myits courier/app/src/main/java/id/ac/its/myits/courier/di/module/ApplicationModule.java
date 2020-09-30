package id.ac.its.myits.courier.di.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import id.ac.its.myits.courier.BuildConfig;
import id.ac.its.myits.courier.data.CourierDataManager;
import id.ac.its.myits.courier.data.DataManager;
import id.ac.its.myits.courier.data.network.ApiHeader;
import id.ac.its.myits.courier.data.network.ApiHelper;
import id.ac.its.myits.courier.data.network.CourierApiHelper;
import id.ac.its.myits.courier.data.pref.CourierPreferencesHelper;
import id.ac.its.myits.courier.data.pref.PreferencesHelper;
import id.ac.its.myits.courier.di.ApiKeyInfo;
import id.ac.its.myits.courier.di.AppTokenInfo;
import id.ac.its.myits.courier.di.ApplicationContext;
import id.ac.its.myits.courier.di.PreferenceInfo;
import id.ac.its.myits.courier.utils.AppConstants;

@Module
public class ApplicationModule {
    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApiKeyInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @AppTokenInfo
    String provideAppToken() { return BuildConfig.APP_TOKEN; }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(preferencesHelper.getAccessToken());
    }

    @Provides
    @Singleton
    @AppTokenInfo
    ApiHeader.ProtectedApiHeader provideProtectedAppApiHeader() {
        return new ApiHeader.ProtectedApiHeader(BuildConfig.APP_TOKEN);
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(CourierApiHelper apiHelper) {
        return apiHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(CourierPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(CourierDataManager appDataManager) {
        return appDataManager;
    }

}
