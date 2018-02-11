package com.mobilemonkeysoftware.dagger2test.di

import com.mobilemonkeysoftware.dagger2test.MainApp
import com.mobilemonkeysoftware.dagger2test.di.activity.ActivityBinder
import com.mobilemonkeysoftware.dagger2test.di.fragment.FragmentBinder
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
// TODO: Step 1 create application component
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class, // TODO: Step 1a add android dagger injection module, for proper injection, this is required!!!
        ActivityBinder::class, // TODO: Step 1b add activity binder
        FragmentBinder::class,
        ApplicationModule::class // TODO: Step 3b add application module
))
@Singleton // TODO: singleton annotation is optional
interface ApplicationComponent {

    // TODO: body of this component should by the same always!!

    @Component.Builder
    interface Builder {

        @dagger.BindsInstance
        fun application(application: MainApp): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }

    // TODO: inject application, application contains dispatching android injector for registration of android activates, in future fragments, services and so on
    fun inject(application: MainApp)

}