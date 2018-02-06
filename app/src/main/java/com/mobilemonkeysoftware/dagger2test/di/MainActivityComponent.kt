package com.mobilemonkeysoftware.dagger2test.di

import com.mobilemonkeysoftware.dagger2test.MainActivity
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by AR on 06/02/2018.
 */
@Subcomponent(modules = arrayOf(MainActivityComponent.MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    abstract class MainActivityModule

}