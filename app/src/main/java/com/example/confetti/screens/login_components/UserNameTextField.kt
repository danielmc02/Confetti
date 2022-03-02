package com.example.confetti.screens.login_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun UserNameTextField(){
    var userName by remember { mutableStateOf("") }

    OutlinedTextField(value = userName,
        onValueChange = {it -> userName = it},
        label = { Text(text = "Email")},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            unfocusedLabelColor = Color.Black,
            disabledLabelColor = Color.Black,
            focusedLabelColor = Color.Black,
            placeholderColor = Color.Red,
            textColor = Color.Black
        ), modifier = Modifier,
        shape = RoundedCornerShape(30.dp),





    )
}

@Preview
@Composable
fun FullScreen(){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()) {
        UserNameTextField()
    }
}