package com.mobilemonkeysoftware.dagger2test.ui.activity.main

import javax.inject.Inject

/**
 * Created by AR on 11/02/2018.
 */
@MainActivityScope
class StringHelperActivity @Inject constructor() {

    fun string(): String = "STRING_HELPER_ACTIVITY_1"

}