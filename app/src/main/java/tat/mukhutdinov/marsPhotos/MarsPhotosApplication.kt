package tat.mukhutdinov.marsPhotos

import android.app.Application
import tat.mukhutdinov.marsPhotos.data.AppContainer
import tat.mukhutdinov.marsPhotos.data.DefaultAppContainer

class MarsPhotosApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}