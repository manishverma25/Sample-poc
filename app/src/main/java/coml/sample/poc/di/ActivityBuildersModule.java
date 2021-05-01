package coml.sample.poc.di;


import coml.sample.poc.ui.AuthActivity;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {


    @ContributesAndroidInjector (  modules = {AuthViewModelsModule.class})

    public abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return "this is a test string";
    }
}
