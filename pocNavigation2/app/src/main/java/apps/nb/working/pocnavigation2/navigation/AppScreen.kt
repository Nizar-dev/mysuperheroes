package apps.nb.working.pocnavigation2.navigation


private object AppRoutes {
    const val HOME = "home"
    const val LOGIN = "login"
    const val REGISTER = "register"
    const val MAINGRAPH = "maingraph"
}
sealed class AppScreen (val route: String) {
    object MainGraph : AppScreen(AppRoutes.MAINGRAPH){
        object Home : AppScreen(AppRoutes.HOME)
        object Login : AppScreen(AppRoutes.LOGIN)
        object Register : AppScreen(AppRoutes.REGISTER)
    }
}