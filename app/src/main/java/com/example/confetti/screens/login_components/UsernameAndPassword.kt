package com.example.confetti.screens.login_components

import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.confetti.ui.theme.Grey
import com.example.confetti.ui.theme.WhiteOnBackGround


@Composable
fun LoginComposable(){
    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.SpaceBetween,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Surface(elevation = 6.dp,
            shape = RoundedCornerShape(20.dp),
            color = MaterialTheme.colors.primaryVariant,
            modifier = Modifier
                .width(300.dp)
                .height(130.dp)
        ){
            Column(modifier = Modifier) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(.5f)) {
                    UserNameTextField()
                }
                Row(modifier = Modifier.fillMaxWidth().background(Grey).weight(.005f)) {
                    
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .weight(.5f)) {
                    PasswordTextField()
                }
            }

        }
        Spacer(modifier = Modifier.height(50.dp))
        LoginButton()
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
        LoginComposable()
    }
}