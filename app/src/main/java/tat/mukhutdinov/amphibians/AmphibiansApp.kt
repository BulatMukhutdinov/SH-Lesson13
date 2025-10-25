package tat.mukhutdinov.amphibians

import android.app.Application
import tat.mukhutdinov.amphibians.infrastructure.AppContainer
import tat.mukhutdinov.amphibians.infrastructure.DefaultAppContainer

class AmphibiansApp : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}