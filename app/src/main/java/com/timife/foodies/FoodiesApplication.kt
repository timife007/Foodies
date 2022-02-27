package com.timife.foodies

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import java.util.logging.Logger

/**
 * Created by timife on 25/02/22
 */

@HiltAndroidApp
class FoodiesApplication: Application(){


    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    private fun initLogger() {
//        Logger.init()
    }

}