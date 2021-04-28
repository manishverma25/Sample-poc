package coml.sample.poc.di

import android.app.Application
import coml.sample.poc.utility.BaseApplication1
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(
        modules = [ AndroidSupportInjectionModule::class]
)
public interface AppComponent1 : AndroidInjector<BaseApplication1> {

    @Component.Builder
    interface Builder  {

        @BindsInstance
        fun application(application: Application?):Builder
        fun build(): AppComponent1
    }
}