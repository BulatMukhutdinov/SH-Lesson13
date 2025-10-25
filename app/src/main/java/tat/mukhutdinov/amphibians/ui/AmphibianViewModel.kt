package tat.mukhutdinov.amphibians.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.launch
import tat.mukhutdinov.amphibians.AmphibiansApp
import tat.mukhutdinov.amphibians.data.boundary.AmphibianRepository
import tat.mukhutdinov.amphibians.infrastructure.model.LoadableData
import tat.mukhutdinov.amphibians.ui.model.Amphibian
import java.io.IOException

class AmphibianViewModel(
    private val repository: AmphibianRepository
) : ViewModel() {

    var amphibians: LoadableData<List<Amphibian>> by mutableStateOf(LoadableData.Loading)
        private set

    init {
        loadAmphibians()
    }

    fun loadAmphibians() {
        viewModelScope.launch {
            amphibians = try {
                LoadableData.Success(repository.getAmphibians())
            } catch (e: IOException) {
                LoadableData.Error
            }
        }
    }

    companion object {
        val factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibiansApp)
                val amphibianRepository = application.container.amphibianRepository
                AmphibianViewModel(amphibianRepository)
            }
        }
    }
}