package com.mobilemonkeysoftware.dagger2test

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Singleton
class StringHelper2 @Inject constructor(
        private val stringHelper1: StringHelper1,
        @Named("string1") private val string1: String
) {

//    @Inject
//    internal lateinit var stringHelper1: StringHelper1

    fun string(): String = "STRING_HELPER_2" + stringHelper1.string() + string1

}