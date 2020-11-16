package id.ac.its.myits.courier.di.component;

import dagger.Component;
import id.ac.its.myits.courier.di.PerActivity;
import id.ac.its.myits.courier.di.module.ActivityModule;
import id.ac.its.myits.courier.ui.login.LoginActivity;
import id.ac.its.myits.courier.ui.main.MainActivity;
import id.ac.its.myits.courier.ui.splash.SplashActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(LoginActivity activity);

    void inject(MainActivity activity);

    void inject(SplashActivity activity);
}
