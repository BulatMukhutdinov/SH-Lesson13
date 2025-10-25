package tat.mukhutdinov.amphibians.infrastructure

import tat.mukhutdinov.amphibians.data.boundary.AmphibianRepository

interface AppContainer {
    val amphibianRepository: AmphibianRepository
}