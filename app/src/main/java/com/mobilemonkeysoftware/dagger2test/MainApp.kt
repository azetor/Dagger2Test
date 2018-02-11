package com.mobilemonkeysoftware.dagger2test

import android.app.Activity
import android.app.Application
import com.mobilemonkeysoftware.dagger2test.di.ApplicationModule
import com.mobilemonkeysoftware.dagger2test.di.DaggerApplicationComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject

/**
 * Created by AR on 06/02/2018.
 */
class MainApp : Application(), HasDispatchingActivityInjector /* TODO: Step 1c implement HasDispatchingActivityInjector interface, required!!! */ {

    @Inject
    internal lateinit var dispatchingAndroidActivityInjector: DispatchingAndroidInjector<Activity>

    // TODO: Step 1c for activity injection
    override fun activityInjector(): DispatchingAndroidInjector<Activity> = dispatchingAndroidActivityInjector

    override fun onCreate() {
        super.onCreate()

        // TODO: Step 2 use application component retrofitted by dagger to start dagger mapping
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }

}