package tat.mukhutdinov.marsPhotos.fake

import tat.mukhutdinov.marsPhotos.network.MarsPhoto

object FakeDataSource {
    const val ID_ONE = "id1"
    const val ID_TWO = "id2"
    const val URL_ONE = "url.1"
    const val URL_TWO = "url.2"

    val photosList = listOf(
        MarsPhoto(
            id = ID_ONE,
            imageUrl = URL_ONE
        ),
        MarsPhoto(
            id = ID_TWO,
            imageUrl = URL_TWO
        )
    )
}