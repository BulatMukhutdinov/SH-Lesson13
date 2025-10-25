package tat.mukhutdinov.marsPhotos.fake

import tat.mukhutdinov.marsPhotos.data.MarsPhotosRepository
import tat.mukhutdinov.marsPhotos.network.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> =
        FakeDataSource.photosList
}
