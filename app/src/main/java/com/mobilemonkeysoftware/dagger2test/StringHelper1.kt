package com.mobilemonkeysoftware.dagger2test

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Singleton
class StringHelper1 @Inject constructor() {

    fun string(): String = "STRING_HELPER_1: " + hashCode().toString()

}