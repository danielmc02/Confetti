package com.example.confetti.View.Screens.LoginScreen_SignUpScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme


@Composable
fun SignUpScreen(loginSignUpViewModel: LoginSignUpViewModel)
{
    ConfettiTheme() {
        Column(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)) {//Whole screen

            //Row for title, "sign up"

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .weight(.1f)) {
                Text(text = "Sign Up", color = MaterialTheme.colors.onBackground,
                fontSize = 32.sp, )

            }
            Column(modifier = Modifier.weight(.8f)) {
                
            }

        }
    }

}


@Preview
@Composable
fun Screen()
{
    SignUpScreen(LoginSignUpViewModel())
}