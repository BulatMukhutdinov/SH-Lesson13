package tat.mukhutdinov.amphibians.data.boundary

import tat.mukhutdinov.amphibians.ui.model.Amphibian

interface AmphibianRepository {

    suspend fun getAmphibians(): List<Amphibian>
}