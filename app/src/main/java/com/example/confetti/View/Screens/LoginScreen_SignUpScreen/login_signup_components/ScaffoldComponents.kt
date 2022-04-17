package com.example.confetti.View.Screens.LoginScreen_SignUpScreen.signup_components

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TopAppBar( drawerState: BottomDrawerState, scope: CoroutineScope )
{
    TopAppBar(title = { Text(text = "Sign UP")},
    navigationIcon = {
        IconButton(onClick = { scope.launch { drawerState.close() } })
        {
            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = "Back Button")
        }
    }
        )
}
