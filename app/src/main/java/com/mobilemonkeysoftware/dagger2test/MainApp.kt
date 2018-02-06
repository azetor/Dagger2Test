package com.mobilemonkeysoftware.dagger2test

import android.app.Activity
import android.app.Application
import com.mobilemonkeysoftware.dagger2test.di.DaggerApplicationComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasDispatchingActivityInjector
import javax.inject.Inject

/**
 * Created by AR on 06/02/2018.
 */
class MainApp : Application(), HasDispatchingActivityInjector {

    @Inject
    lateinit var dispatchingAndroidActivityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): DispatchingAndroidInjector<Activity>  = dispatchingAndroidActivityInjector

//    // TODO XXX for activity injection
//    override fun activityInjector(): DispatchingAndroidInjector<Activity> = dispatchingAndroidActivityInjector

    override fun onCreate() {
        super.onCreate()

        // TODO: Step 1
        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this)
    }
}