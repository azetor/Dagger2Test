package com.mobilemonkeysoftware.dagger2test.di.fragment

import android.app.Fragment
import com.mobilemonkeysoftware.dagger2test.ui.fragment.main.MainFragment
import com.mobilemonkeysoftware.dagger2test.ui.fragment.main.MainFragmentComponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.FragmentKey
import dagger.multibindings.IntoMap

/**
 * Created by AR on 11/02/2018.
 */
@Module
abstract class FragmentBinder {

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun bindMainFragmentInjectorFactory(builder: MainFragmentComponent.Builder): AndroidInjector.Factory<out Fragment>

}