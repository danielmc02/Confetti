package com.example.confetti

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.confetti.screens.LoginScreen

@Composable
fun MainScreen(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "LoginScreen" ){
        composable("LoginScreen"){
            LoginScreen(modifier = Modifier)
        }
    }
}