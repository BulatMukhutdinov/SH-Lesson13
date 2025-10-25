package tat.mukhutdinov.amphibians.data.dto

import tat.mukhutdinov.amphibians.ui.model.Amphibian
import tat.mukhutdinov.amphibians.ui.model.AmphibianType

class AmphibianMapper {

    fun map(dto: AmphibianDto): Amphibian? {
        return Amphibian(
            name = dto.name ?: return null,
            type = mapType(dto.type) ?: return null,
            description = dto.description ?: return null,
            imageUrl = dto.imageUrl ?: return null,
        )
    }

    private fun mapType(type: String?): AmphibianType? =
        when (type?.lowercase()) {
            "toad" -> AmphibianType.TOAD
            "frog" -> AmphibianType.FROG
            "salamander" -> AmphibianType.SALAMANDER
            else -> null
        }
}