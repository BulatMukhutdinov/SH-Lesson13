package tat.mukhutdinov.marsPhotos.data

import tat.mukhutdinov.marsPhotos.network.MarsApiService
import tat.mukhutdinov.marsPhotos.network.MarsPhoto

class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {

    override suspend fun getMarsPhotos(): List<MarsPhoto> =
        marsApiService.getPhotos()
}