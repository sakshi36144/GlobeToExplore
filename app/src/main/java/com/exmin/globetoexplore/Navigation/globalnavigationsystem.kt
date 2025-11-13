package com.exmin.globetoexplore.Navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.exmin.globetoexplore.Homescreen.HomeScreen
import com.exmin.globetoexplore.Homescreen.chatdesign
import com.exmin.globetoexplore.UserRegistrationScreen.userregistrationscreen
import com.exmin.globetoexplore.callscreen.callscreen
import com.exmin.globetoexplore.communityscreen.communityscreen
import com.exmin.globetoexplore.representation.SplashScreen
import com.exmin.globetoexplore.welcomescreen.welcomescreen

@Composable
fun GlobalNavigationSystem() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.representation
    ) {
        composable<Routes.representation> {
            SplashScreen(navController)
        }
        composable<Routes.WelcomeScreen> {
            welcomescreen(navController)
        }
        composable<Routes.Homescreen> {
            HomeScreen()
        }
        composable<Routes.UserRegistrationScreen> {
            userregistrationscreen()
        }
        composable<Routes.Communitescreen> {
            communityscreen()
        }
        composable<Routes.Callscreen> {
            callscreen()
        }
        composable<Routes.Homescreen> {
            //chatdesign()
        }
    }
}
