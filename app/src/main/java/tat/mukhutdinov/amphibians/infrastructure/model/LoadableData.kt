package tat.mukhutdinov.amphibians.infrastructure.model

sealed interface LoadableData<out T> {
    data class Success<T>(val data: T) : LoadableData<T>
    object Error : LoadableData<Nothing>
    object Loading : LoadableData<Nothing>
}