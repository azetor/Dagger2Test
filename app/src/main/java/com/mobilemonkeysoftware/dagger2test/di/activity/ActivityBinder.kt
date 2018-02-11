package com.mobilemonkeysoftware.dagger2test.di.activity

import android.app.Activity
import com.mobilemonkeysoftware.dagger2test.ui.activity.main.MainActivity
import com.mobilemonkeysoftware.dagger2test.ui.activity.main.MainActivityComponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by AR on 06/02/2018.
 */
// TODO: Step 2 create binder module for binding all activates
@Module
abstract class ActivityBinder {

    // TODO: body of this module should by the same always!!

    // TODO: Step 2a add binding to activity
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

    // TODO: and so on ...
//    @Binds
//    @IntoMap
//    @ActivityKey(NextActivity::class)
//    abstract fun bindNextActivityInjectorFactory(builder: NextActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}