package tat.mukhutdinov.marsPhotos.ui.screens

import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import tat.mukhutdinov.marsPhotos.fake.FakeDataSource
import tat.mukhutdinov.marsPhotos.fake.FakeNetworkMarsPhotosRepository
import tat.mukhutdinov.marsPhotos.rule.TestDispatcherRule

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()

    @Test
    fun getMarsPhotos_verifyMarsUiStateSuccess() = runTest {
        val marsViewModel = MarsViewModel(
            marsPhotosRepository = FakeNetworkMarsPhotosRepository()
        )
        assertEquals(
            MarsUiState.Success(FakeDataSource.photosList),
            marsViewModel.marsUiState
        )
    }
}