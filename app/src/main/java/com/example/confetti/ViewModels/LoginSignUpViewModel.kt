package com.example.confetti.ViewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.*

class LoginSignUpViewModel: ViewModel() {

    // For the current Username
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
}

