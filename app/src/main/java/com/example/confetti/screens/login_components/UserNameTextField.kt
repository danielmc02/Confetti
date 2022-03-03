package com.example.confetti.screens.login_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
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

    OutlinedTextField(singleLine = true, maxLines = 1, value = userName,
        onValueChange = {it -> userName = it},
        label = { Text(text = "Email or username")},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            unfocusedLabelColor = MaterialTheme.colors.onBackground,
            disabledLabelColor = Color.Gray,
            focusedLabelColor = MaterialTheme.colors.onBackground,
            placeholderColor = Color.Red,
            cursorColor = MaterialTheme.colors.onBackground,
            textColor = MaterialTheme.colors.onBackground
        ), modifier = Modifier,
        shape = RoundedCornerShape(30.dp),



    )
}

@Composable
fun PasswordTextField(){
    var userName by remember { mutableStateOf("") }

    OutlinedTextField(singleLine = true, maxLines = 1, value = userName,
        onValueChange = {it -> userName = it},
        label = { Text(text = "Password")},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = Color.Transparent,
            unfocusedLabelColor = MaterialTheme.colors.onBackground,
            disabledLabelColor = Color.Gray,
            focusedLabelColor = MaterialTheme.colors.onBackground,
            placeholderColor = Color.Red,
            cursorColor = MaterialTheme.colors.onBackground,
            textColor = MaterialTheme.colors.onBackground
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