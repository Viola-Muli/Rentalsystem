package com.example.rentalsystem.navigation

import android.util.Property
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.rentalsystem.ui.theme.screens.about.AboutScreen
import com.example.rentalsystem.ui.theme.screens.home.HomeScreen
import com.example.rentalsystem.ui.theme.screens.login.LogInScreen
import com.example.rentalsystem.ui.theme.screens.signup.SignupScreen
import com.example.rentalsystem.ui.theme.screens.splash.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
          SignupScreen (navController = navController)
        }
        composable(ROUT_LOGIN) {
            LogInScreen(navController = navController)
        }



    }}