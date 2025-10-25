    package tat.mukhutdinov.marsPhotos.fake

    import tat.mukhutdinov.marsPhotos.network.MarsApiService
    import tat.mukhutdinov.marsPhotos.network.MarsPhoto

    class FakeMarsApiService : MarsApiService {

        override suspend fun getPhotos(): List<MarsPhoto> =
            FakeDataSource.photosList
    }