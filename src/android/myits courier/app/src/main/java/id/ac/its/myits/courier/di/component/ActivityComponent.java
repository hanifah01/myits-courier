package id.ac.its.myits.courier.di.component;

import dagger.Component;
import id.ac.its.myits.courier.di.PerActivity;
import id.ac.its.myits.courier.di.module.ActivityModule;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
