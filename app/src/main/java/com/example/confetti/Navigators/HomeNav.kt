package com.example.confetti.Navigators

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.confetti.View.Screens.HomeScreens.MainHome

@Composable
fun HomeNav()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "HomeScreen")
    {
        composable("HomeScreen")
        {
            MainHome()
        }
    }
}