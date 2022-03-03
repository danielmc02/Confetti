package com.example.confetti.screens.login_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.confetti.R
import com.example.confetti.ui.theme.ConfettiTheme
import com.example.confetti.ui.theme.Grey



@Composable
fun LoginFormComposable() {

    ConfettiTheme() {

        Column(
            modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                elevation = 6.dp,
                border = BorderStroke(width = 2.dp, brush = Brush.horizontalGradient(listOf(Color.Green,Color.Magenta))),
                shape = RoundedCornerShape(20.dp),
                color = MaterialTheme.colors.primaryVariant,
                modifier = Modifier
                    .width(300.dp)
                    .height(130.dp)
            ) {
                Column(modifier = Modifier) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(.5f)
                    ) {
                        UserNameTextField()
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Grey)
                            .weight(.005f)
                    ) {

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(.5f)
                    ) {
                        PasswordTextField()
                    }
                }

            }

            Spacer(modifier = Modifier.height(50.dp))
            LoginButton()
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.None,
                        color = MaterialTheme.colors.onBackground.copy(alpha = .8f)
                    )
                ){
                    append("Don't have an account?")
                }
                withStyle(
                    style = SpanStyle(
                        textDecoration = TextDecoration.None,
                        color = MaterialTheme.colors.onBackground,

                    )
                ){
                    append(" Sign up")
                }
            },
                fontSize = 15.sp,
                color = MaterialTheme.colors.onBackground,
                modifier = Modifier.clickable {  }
            )
        }

    }
}

@Preview
@Composable
fun fulsce(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier
        .fillMaxSize()
        .background(
            White
        )) {
        LoginFormComposable()
    }
}