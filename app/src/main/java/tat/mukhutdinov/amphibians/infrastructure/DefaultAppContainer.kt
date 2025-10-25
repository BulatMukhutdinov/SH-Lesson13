package tat.mukhutdinov.amphibians.infrastructure

import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import tat.mukhutdinov.amphibians.data.NetworkAmphibianRepository
import tat.mukhutdinov.amphibians.data.boundary.AmphibianApi
import tat.mukhutdinov.amphibians.data.boundary.AmphibianRepository
import tat.mukhutdinov.amphibians.data.dto.AmphibianMapper

class DefaultAppContainer : AppContainer {

    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService: AmphibianApi by lazy {
        retrofit.create(AmphibianApi::class.java)
    }

    private val amphibianMapper: AmphibianMapper by lazy {
        AmphibianMapper()
    }

    override val amphibianRepository: AmphibianRepository by lazy {
        NetworkAmphibianRepository(
            api = retrofitService,
            mapper = amphibianMapper
        )
    }

    companion object {
        private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"
    }
}