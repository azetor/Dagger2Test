package com.mobilemonkeysoftware.dagger2test.di

import com.mobilemonkeysoftware.dagger2test.MainApp
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        // TODO Activity binder
        ActivityBinder::class,
        ApplicationModule::class
))
@Singleton
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @dagger.BindsInstance
        fun application(application: MainApp): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: MainApp)
}