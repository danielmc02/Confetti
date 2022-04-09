package com.example.confetti.ViewModels

import androidx.compose.material.BottomDrawerState
import androidx.compose.material.BottomDrawerValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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

    //For changing the drawer state
/*
    @OptIn(ExperimentalMaterialApi::class)
    val _drawerState:MutableLiveData<BottomDrawerValue> = MutableLiveData(BottomDrawerValue.Closed)  //Global initial value for bottom drawer starting with closed

    @OptIn(ExperimentalMaterialApi::class)
    val drawerState: LiveData<BottomDrawerValue> = _drawerState
*/
    @OptIn(ExperimentalMaterialApi::class)
    private val _drawerState: LiveData<BottomDrawerState> = MutableLiveData(BottomDrawerState(BottomDrawerValue.Closed))

    @OptIn(ExperimentalMaterialApi::class)
    val drawerState: LiveData<BottomDrawerState> = _drawerState
   /*
    fun StateChangeDrawerViaCorotines():BottomDrawerState
    {
        println("PPPPPPPPPPPPPPPP")

        return OpenCloseDrawer()
    }
*/



    @OptIn(ExperimentalMaterialApi::class)
    fun OpenCloseDrawer(state: BottomDrawerState):BottomDrawerValue
    {
        if(state == BottomDrawerState(BottomDrawerValue.Closed))
        {
            println("AHHHHHHHHHHHHHHHHH")
            return BottomDrawerValue.Expanded
        }
        else
        {
            println("cccccccccccc")
            return BottomDrawerValue.Expanded
        }
    }

}

