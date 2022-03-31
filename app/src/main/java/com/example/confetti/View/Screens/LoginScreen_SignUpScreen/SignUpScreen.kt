package com.example.confetti.View.Screens.LoginScreen_SignUpScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme


@Composable
fun SignUpScreen(loginSignUpViewModel: LoginSignUpViewModel)
{
    ConfettiTheme() {
        Column(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)) {

        }
    }

}


@Preview
@Composable
fun Screen()
{
    SignUpScreen(LoginSignUpViewModel())
}