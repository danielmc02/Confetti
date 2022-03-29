package com.example.confetti.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginSignUpViewModel: ViewModel() {

    // For the current Username
    private val _currentUsernameText = MutableLiveData("") // When the view updates, it passes it here
    val currentUsernameText:LiveData<String> = _currentUsernameText // Act as the actual which copies the reference

    //For the current Password
    private val _currentPasswordText = MutableLiveData("") // When the view updates, it passes it here
    val currentPasswordText: LiveData<String> = _currentPasswordText // Act as the actual which copies the references
}