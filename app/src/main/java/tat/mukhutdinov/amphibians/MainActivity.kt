package tat.mukhutdinov.amphibians

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import tat.mukhutdinov.amphibians.infrastructure.theme.AmphibiansTheme
import tat.mukhutdinov.amphibians.ui.AmphibianScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AmphibiansTheme {
                AmphibianScreen()
            }
        }
    }
}