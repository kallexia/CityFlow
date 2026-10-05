package gr.unipi.cityflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import gr.unipi.cityflow.ui.navigation.AppNavHost
import gr.unipi.cityflow.ui.theme.CityFlowTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            CityFlowTheme {
                val navController = rememberNavController()

                AppNavHost(
                    navController = navController
                )
            }
        }
    }
}