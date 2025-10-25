package tat.mukhutdinov.marsPhotos.data

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import tat.mukhutdinov.marsPhotos.fake.FakeDataSource
import tat.mukhutdinov.marsPhotos.fake.FakeMarsApiService

class NetworkMarsRepositoryTest {

    @Test
    fun getMarsPhotos_verifyPhotoList() = runTest {
        val repository = NetworkMarsPhotosRepository(
            marsApiService = FakeMarsApiService()
        )

        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
    }
}