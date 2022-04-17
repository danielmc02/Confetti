package com.example.confetti.View.Screens.LoginScreen_SignUpScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.BottomDrawerState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_signup_components.SignUpButton
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_signup_components.SignUpPasswordTextField
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_signup_components.SignUpUsernameTextField
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.signup_components.TopAppBar
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme
import kotlinx.coroutines.CoroutineScope

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SignUpScreen(loginSignUpViewModel: LoginSignUpViewModel, drawerState: BottomDrawerState,scope: CoroutineScope)
{
    ConfettiTheme() {
        Scaffold(topBar = {
            TopAppBar( drawerState = drawerState, scope = scope ) }
        ) { nativePadding ->
            Column(modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)) {//Whole screen

                //Row for title, "sign up"


                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .weight(.8f)
                        .fillMaxWidth()) {
                    SignUpUsernameTextField(loginSignUpViewModel)
                    SignUpPasswordTextField(loginSignUpViewModel)

                    SignUpButton(loginSignUpViewModel)
                }

            }
        }

    }

}




@Composable
fun RedScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Red)) {
        
    }
}