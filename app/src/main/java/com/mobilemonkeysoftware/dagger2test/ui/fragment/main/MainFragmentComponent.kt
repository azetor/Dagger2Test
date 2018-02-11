package com.mobilemonkeysoftware.dagger2test.ui.fragment.main

import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by AR on 11/02/2018.
 */
@Subcomponent(modules = arrayOf(MainFragmentComponent.MainFragmentModule::class))
@MainFragmentScope
interface MainFragmentComponent : AndroidInjector<MainFragment> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainFragment>()

    @Module
    abstract class MainFragmentModule

}