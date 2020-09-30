package id.ac.its.myits.courier.di.module;

import android.app.Service;

import dagger.Module;
import dagger.Provides;
import id.ac.its.myits.courier.utils.rx.CourierAppScheduler;
import id.ac.its.myits.courier.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ServiceModule {
    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new CourierAppScheduler();
    }
}
