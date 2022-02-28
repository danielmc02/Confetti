package com.example.confetti.screens


import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.confetti.screens.login_components.LoginButton
import com.example.confetti.screens.login_components.UserNameTextField
import com.example.confetti.ui.theme.ConfettiTheme


@Composable
fun LoginScreen(modifier: Modifier, ){
    ConfettiTheme() {

        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)) {

            Row(
                modifier
                    .fillMaxWidth()
                    .weight(.2f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                //Top-Title
                Text(text = "Confetti",
                    fontSize = 40.sp,
                    color = MaterialTheme.colors.onBackground,
                )

            }
            Column(
                modifier
                    .fillMaxWidth()
                    .weight(.7f)) {
                //Body for sign in components
                Row(
                    modifier
                        .fillMaxWidth()
                        .weight(.1f)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.Start) {
                    //Title for login
                    Text(text = "Login", fontSize = 32.sp, color = MaterialTheme.colors.onBackground)
                    
                }
                Column(
                    modifier
                        .fillMaxWidth()
                        .weight(.7f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                    //Body for text fields
                    UserNameTextField()
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .weight(.2f)
                        .background(Color.Gray),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                    //Body for Sign in button
                    LoginButton()
                }
            }
            Row(
                modifier
                    .fillMaxWidth()
                    .weight(.1f),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start) {
                //Dont have an account, sign up
                Text(text = buildAnnotatedString {
                       withStyle(
                            style = SpanStyle(
                                textDecoration = TextDecoration.Underline
                            )
                       ){
                           append("Don't have an account?")
                       }
                },
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.onBackground,
                    modifier = Modifier.clickable {  }
                )
            }
        }
    }
}

@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewScreen(){
    LoginScreen(modifier = Modifier)
}