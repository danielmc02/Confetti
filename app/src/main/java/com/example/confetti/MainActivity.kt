package com.example.confetti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import com.example.confetti.ui.theme.ConfettiTheme
import com.google.firebase.auth.FirebaseAuth

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConfettiTheme {
                // A surface container using the 'background' color from the theme
                MainScreen(auth = auth)

            }
        }
    }
}

