package com.example.confetti.screens.login_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginButton(){
    Button(onClick = { /*TODO*/ },
    modifier = Modifier
        .clip(RoundedCornerShape(10.dp))
        .width(100.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Blue,
            contentColor = MaterialTheme.colors.onBackground
        )
        ) {
        Text(text = "Login")
    }
}


@Preview
@Composable
fun FulScreen(){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()) {
        LoginButton()
    }
}