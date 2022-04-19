package com.example.confetti.ViewModels

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material.ExperimentalMaterialApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.confetti.Activities.MainActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginSignUpViewModel: ViewModel() {
    // For the current Username
    val auth = Firebase.auth

    private val _currentUsernameText:MutableLiveData<String> = MutableLiveData("") // When the view updates, it passes it here
    val currentUsernameText:LiveData<String> = _currentUsernameText // Act as the actual which copies the reference

    //Function for changing the references value
        fun updateUsernameReference(string:String)
        {
            _currentUsernameText.value = string
        }
    //For the current Password
    private val _currentPasswordText = MutableLiveData("") // When the view updates, it passes it here
    val currentPasswordText: LiveData<String> = _currentPasswordText // Act as the actual which copies the references

    //Function for changing the references value
        fun updatePasswordReference(string:String)
        {
            _currentPasswordText.value = string
        }

    //Start of sign up components

    private val _currentSignUpUsernameText:MutableLiveData<String> = MutableLiveData("")
    val currentSignUpUsernameText:LiveData<String> = _currentSignUpUsernameText
    //Function for changing the references value
    fun updateSignUpUsernameText(string:String)
    {
        _currentSignUpUsernameText.value = string
    }

    private val _currentSignUpPasswordText:MutableLiveData<String> = MutableLiveData("")
    val currentSignUpPasswordText:LiveData<String> = _currentSignUpPasswordText
    //Function for changing the references value
    fun updateSignUpPasswordText(string:String)
    {
        _currentSignUpPasswordText.value = string
    }

    @OptIn(ExperimentalMaterialApi::class)
    fun SignInUser(email:String = currentUsernameText.value.toString(), password:String = currentPasswordText.value.toString(), Context :ComponentActivity = MainActivity() )
    {
        var emaill = "danielmccray40@gmail.com"
        var paswordd = "123123"
        auth.signInWithEmailAndPassword(emaill, paswordd)
            .addOnCompleteListener(Context) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.i("HELLO", "signInWithEmail:success")
                    val user = auth.currentUser
                    MainActivity().ActivitySuccess()
                } else {
                    // If sign in fails, display a message to the user.
                    Log.i("HELLO", "signInWithEmail:failure", task.exception)

                }
            }
    }

    @OptIn(ExperimentalMaterialApi::class)
    fun SignUpUser(email: String = currentSignUpUsernameText.value.toString(), password: String = currentSignUpPasswordText.value.toString(), CurrentActivity :ComponentActivity = MainActivity() /*, loginSignUpViewModel: LoginSignUpViewModel */)
    {

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(CurrentActivity) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.i("HELLO", "createUserWithEmail:success")
                    val user = auth.currentUser

                } else {
                    // If sign in fails, display a message to the user.
                    Log.i("Hello", "createUserWithEmail:failure", task.exception)
                }
            }

    }




}




