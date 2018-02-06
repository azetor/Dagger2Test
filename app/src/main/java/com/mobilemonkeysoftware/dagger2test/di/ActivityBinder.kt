package com.mobilemonkeysoftware.dagger2test.di

import android.app.Activity
import com.mobilemonkeysoftware.dagger2test.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by AR on 06/02/2018.
 */
// TODO Step 2 add binding
@Module
abstract class ActivityBinder {


    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}