package coml.sample.poc.utility

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


//class BaseApplication : DaggerApplication() {
//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().application(this).build()
//        return null
//    }
//}


class BaseApplication1 : Application() {
//    DaggerAppComponent
//    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
//        return DaggerAppComponent.builder().application(this).build()
//        return null
//    }
}