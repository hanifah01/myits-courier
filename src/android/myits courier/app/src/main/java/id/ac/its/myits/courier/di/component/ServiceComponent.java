package id.ac.its.myits.courier.di.component;

import dagger.Component;
import id.ac.its.myits.courier.di.PerService;
import id.ac.its.myits.courier.di.module.ServiceModule;

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
}
