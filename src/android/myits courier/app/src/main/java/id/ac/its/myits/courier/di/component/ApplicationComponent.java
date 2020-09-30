package id.ac.its.myits.courier.di.component;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import id.ac.its.myits.courier.CourierApp;
import id.ac.its.myits.courier.data.DataManager;
import id.ac.its.myits.courier.di.ApplicationContext;
import id.ac.its.myits.courier.di.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(CourierApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
