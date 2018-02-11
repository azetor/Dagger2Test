package com.mobilemonkeysoftware.dagger2test.di

import com.mobilemonkeysoftware.dagger2test.BuildConfig
import com.mobilemonkeysoftware.dagger2test.ui.activity.main.MainActivityComponent
import com.mobilemonkeysoftware.dagger2test.ui.fragment.main.MainFragmentComponent
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
// TODO: Step 3 create application module, for providing all dependencies, for example debug information
@Module(subcomponents = arrayOf(
        MainActivityComponent::class, // TODO: Step 3a add activity component
        MainFragmentComponent::class
))
class ApplicationModule {

    @Singleton
    @Provides
    fun provideDebug(): Boolean = BuildConfig.DEBUG

    @Singleton
    @Provides
    @Named("string1")
    fun provideString1() = "STRING_1"

    @Singleton
    @Provides
    @Named("string2")
    fun provideString2() = "STRING_2"

}