package tat.mukhutdinov.marsPhotos.data

import tat.mukhutdinov.marsPhotos.network.MarsPhoto

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}