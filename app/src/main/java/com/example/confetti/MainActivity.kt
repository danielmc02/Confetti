package com.example.confetti

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.ExperimentalMaterialApi
import com.example.confetti.Activities.HomeActivity
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


@ExperimentalMaterialApi
class MainActivity : ComponentActivity() { // The absolute beginning,
    private lateinit var auth: FirebaseAuth // Global variable to activity scope
    val model: LoginSignUpViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) { // First Activity instance
        super.onCreate(savedInstanceState)



        setContent { //Sets the UI
            ConfettiTheme {
                // A surface container using the 'background' color from the theme
                MainScreen() //Uses navController to link all screen available for this activity

            }
        }

    }

    public override fun onStart() {
        super.onStart()
        auth = Firebase.auth
        // Check if user is signed in (non-null) and update UI accordingly.
        //Have an if statement to check if a user is logged in before setting content
        val currentUser = auth.currentUser
        if(currentUser != null) // If not-null the user is signed in
        {
            Intent(this, HomeActivity::class.java).also {
                startActivity(it)
            } // start the home page activity
        }
      //  else // else continue the login/signup screen via onCreate
        //{

        //}
    }
}

