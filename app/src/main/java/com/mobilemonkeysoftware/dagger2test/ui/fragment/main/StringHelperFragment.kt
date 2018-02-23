package com.mobilemonkeysoftware.dagger2test.ui.fragment.main

import javax.inject.Inject

/**
 * Created by AR on 11/02/2018.
 */
@MainFragmentScope
class StringHelperFragment @Inject constructor() {

    fun string(): String = "STRING_HELPER_FRAGMENT_1: " + hashCode().toString()

}