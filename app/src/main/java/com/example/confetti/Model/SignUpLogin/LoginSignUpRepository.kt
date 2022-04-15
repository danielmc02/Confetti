package com.example.confetti.Model.SignUpLogin

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.google.firebase.auth.FirebaseAuth

class LoginSignUpRepository: ComponentActivity(){

    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: LoginSignUpViewModel by viewModels()
        //Initialize Firebase
        var email = model.currentSignUpUsernameText.observe(this, Observer { it ->   })//.toString()
        var password = model.currentSignUpPasswordText.toString()

        println("The email and password is $email and $password")
        Log.i("Hello","The email and password is $email and $password")

        /*

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }
            }
        */
    }









}