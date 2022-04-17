package com.example.confetti.ViewModels

import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.material.ExperimentalMaterialApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.confetti.MainActivity
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

    fun SignInUser(email:String = currentUsernameText.value.toString(), password:String = currentPasswordText.value.toString())
    {
        println("Sign in email and password variables are " + email.toString() + ". If this runs than nothing is wrong with prior code")
        //LoginSignUpRepository().register(email,password)
    }


    @OptIn(ExperimentalMaterialApi::class)
    fun SignUpUser(email: String, password: String, Context :ComponentActivity = MainActivity() /*, loginSignUpViewModel: LoginSignUpViewModel */)
    {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(Context) { task ->
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




