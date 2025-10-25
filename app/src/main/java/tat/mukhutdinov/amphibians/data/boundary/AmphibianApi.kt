package tat.mukhutdinov.amphibians.data.boundary

import retrofit2.http.GET
import tat.mukhutdinov.amphibians.data.dto.AmphibianDto

interface AmphibianApi {

    @GET("amphibians")
    suspend fun getAmphibians(): List<AmphibianDto>
}