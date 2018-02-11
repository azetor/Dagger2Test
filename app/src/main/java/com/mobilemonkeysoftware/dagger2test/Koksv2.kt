package com.mobilemonkeysoftware.dagger2test

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Singleton
class Koksv2 @Inject constructor(
        private val koksDoStringów: KoksDoStringów,
        @Named("koksu3") private val cos: String
) {

//    @Inject
//    internal lateinit var koksDoStringów: KoksDoStringów

    fun testZkoksa2(): String = "koks2" + koksDoStringów.test() + cos

}