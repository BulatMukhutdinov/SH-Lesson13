package tat.mukhutdinov.amphibians.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AmphibianDto(
    @SerialName("name")
    val name: String? = null,
    @SerialName("type")
    val type: String? = null,
    @SerialName("description")
    val description: String? = null,
    @SerialName("img_src")
    val imageUrl: String? = null,
)