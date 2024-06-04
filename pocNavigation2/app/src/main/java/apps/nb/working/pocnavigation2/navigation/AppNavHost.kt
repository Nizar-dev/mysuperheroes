package apps.nb.working.pocnavigation2.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost() {
    val navHostController = rememberNavController()

    Scaffold(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.padding(it)){
            NavHost(
                navController = navHostController,
                startDestination = AppScreen.MainGraph.route
            ){
                mainNavGraph(navController = navHostController)
            }
        }
    }
}