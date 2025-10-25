package tat.mukhutdinov.amphibians.data

import tat.mukhutdinov.amphibians.data.boundary.AmphibianApi
import tat.mukhutdinov.amphibians.data.boundary.AmphibianRepository
import tat.mukhutdinov.amphibians.data.dto.AmphibianMapper
import tat.mukhutdinov.amphibians.ui.model.Amphibian

class NetworkAmphibianRepository(
    private val api: AmphibianApi,
    private val mapper: AmphibianMapper,
) : AmphibianRepository {

    override suspend fun getAmphibians(): List<Amphibian> =
        api.getAmphibians()
            .mapNotNull(mapper::map)
}