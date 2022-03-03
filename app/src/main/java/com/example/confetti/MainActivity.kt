package com.example.confetti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.confetti.ui.theme.ConfettiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConfettiTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()

            }
        }
    }
}

