package com.example.confetti.Activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.confetti.Navigators.HomeNav

class HomeActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent { 
            HomeNav()
            }
        }

    @OptIn(ExperimentalMaterialApi::class)
    fun SignOut()
    {
        val nav = Intent(this, MainActivity::class.java)
        startActivity(nav)
        finish()
    }
}