package com.example.confetti

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.confetti.View.d.LoginScreen
import com.example.confetti.ViewModels.LoginSignUpViewModel

@ExperimentalMaterialApi
@Composable
fun LoginSignUpNav(loginSignUpViewModel: LoginSignUpViewModel){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "LoginScreen_SignUpScreen" ){
        composable("LoginScreen_SignUpScreen"){
            LoginScreen(modifier = Modifier, loginSignUpViewModel)
        }
    }
}