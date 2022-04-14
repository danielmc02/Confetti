package com.example.confetti.ViewModels

import android.app.Activity
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
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


    fun SignUpUser(email: String, password: String , activity: Activity/*, loginSignUpViewModel: LoginSignUpViewModel */)
    {
        println("Current signUpUsername is " + currentSignUpUsernameText.value.toString()) // Outputs to terminal to verify view-model assignment success
        //LoginSignUpRepository().register(email,password)
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(activity) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    //updateUI(user)
                } else {

                }
            }

    }




}




