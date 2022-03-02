package com.example.confetti.screens.login_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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


@Composable
fun LoginComposable(){
    Surface(elevation = 6.dp,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .width(300.dp)
            .height(150.dp)
            .shadow(6.dp)
        ){
        Column(modifier = Modifier
            .background(Magenta)
            

        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .weight(.5f)) {
                UserNameTextField()
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .weight(.5f)) {
                UserNameTextField()
            }
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
        LoginComposable()
    }
}