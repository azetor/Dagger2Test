package com.mobilemonkeysoftware.dagger2test

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by AR on 06/02/2018.
 */
@Singleton
class KoksDoStringów @Inject constructor() {

    fun test(): String = "koks1"

}