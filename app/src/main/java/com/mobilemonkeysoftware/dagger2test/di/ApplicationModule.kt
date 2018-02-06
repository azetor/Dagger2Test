package com.mobilemonkeysoftware.dagger2test.di

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Module(subcomponents = arrayOf(
/* TODO ADD activity component */
        MainActivityComponent::class
))
class ApplicationModule {

    @Singleton
    @Provides
    @Named("koksu3")
    fun provideKoksStringv3() = "KOKS3"

    @Singleton
    @Provides
    @Named("koksu4")
    fun provideKoksStringv4() = "KOKS4"

}