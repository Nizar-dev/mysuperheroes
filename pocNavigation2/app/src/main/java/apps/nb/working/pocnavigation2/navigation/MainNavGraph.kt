package apps.nb.working.pocnavigation2.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import apps.nb.working.pocnavigation2.ui.screen.HomeScreen
import apps.nb.working.pocnavigation2.ui.screen.LoginScreen
import apps.nb.working.pocnavigation2.ui.screen.RegisterScreen

/**
 * creation du graphe
 */
fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = AppScreen.MainGraph.Login.route,
        route = AppScreen.MainGraph.route
    ){
        composable(route = AppScreen.MainGraph.Login.route){
            LoginScreen(navController = navController)
        }
        composable(route = AppScreen.MainGraph.Register.route){
            RegisterScreen(navController = navController)
        }
        composable(route = AppScreen.MainGraph.Home.route){
            HomeScreen(navController = navController)
        }
    }
}