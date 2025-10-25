package tat.mukhutdinov.marsPhotos.data

import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import tat.mukhutdinov.marsPhotos.network.MarsApiService

/**
 * Class responsible for providing dependencies
 */
class DefaultAppContainer : AppContainer {

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }

    override val marsPhotosRepository: MarsPhotosRepository by lazy {
        NetworkMarsPhotosRepository(retrofitService)
    }

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    }
}