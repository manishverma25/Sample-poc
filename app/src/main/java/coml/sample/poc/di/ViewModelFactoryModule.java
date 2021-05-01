package coml.sample.poc.di;

import androidx.lifecycle.ViewModelProvider;


import coml.sample.poc.ui.viewmodel.ViewModelProviderFactory;
import dagger.Binds;
import dagger.Module;


@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}
