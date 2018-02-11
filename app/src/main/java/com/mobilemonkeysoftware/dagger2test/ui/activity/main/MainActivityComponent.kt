package com.mobilemonkeysoftware.dagger2test.ui.activity.main

import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by AR on 06/02/2018.
 */
// TODO: Step 4 create activity component for injecting activity, required!!!
@Subcomponent(modules = arrayOf(MainActivityComponent.MainActivityModule::class))
interface MainActivityComponent : AndroidInjector<MainActivity> {

    // TODO: body of this component should by the same always!!

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

    @Module
    abstract class MainActivityModule

}