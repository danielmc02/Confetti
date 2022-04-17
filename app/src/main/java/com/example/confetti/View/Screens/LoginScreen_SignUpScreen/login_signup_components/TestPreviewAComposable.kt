package com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_signup_components

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults.MinWidth
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.confetti.Model.SignUpLogin.LoginSignUpRepository
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme
import kotlinx.coroutines.launch

@Preview
@Composable
fun FullScreen(){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()) {
        LoginTextField(LoginSignUpViewModel())
    }
}


@Composable
fun LoginTextField(loginSignUpViewModel: LoginSignUpViewModel){
    ConfettiTheme() {
        var text by remember { mutableStateOf("") } // Temporary state holder
        OutlinedTextField(modifier = Modifier.width(MinWidth),
            value = text,
            onValueChange = { newText ->
                text = newText // Assigning temporary state holder value
                loginSignUpViewModel.updateUsernameReference(text) // Updates the actual text via view-model
                println("Current username is " + loginSignUpViewModel.currentUsernameText.value.toString()) // Outputs to terminal to verify view-model assignment success
            },
            shape = RoundedCornerShape(20.dp),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = MaterialTheme.colors.onBackground,
                disabledTextColor = Color.Gray,
                //backgroundColor = Color.Red , dose not work
                cursorColor = Color.Green,
                errorCursorColor = Color.Red,
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = MaterialTheme.colors.onBackground,
                focusedLabelColor = MaterialTheme.colors.onBackground,
                unfocusedLabelColor = MaterialTheme.colors.onBackground,




            ),
           // placeholder = { Text("Username")},
            label = {Text("Username")}

            )
    }

}


@Composable
fun PasswordTextField(loginSignUpViewModel: LoginSignUpViewModel){
    ConfettiTheme() {
        var text by remember { mutableStateOf("") } // Temporary state holder
        OutlinedTextField(modifier = Modifier.width(MinWidth),
            value = text,
            onValueChange = { newText:String ->
                text = newText // Assigning temporary state holder value
                loginSignUpViewModel.updatePasswordReference(text) // Updates the actual text via view-model
                println("Current password is " + loginSignUpViewModel.currentPasswordText.value.toString()) // Outputs to terminal to verify view-model assignment success
                // Outputs to terminal to verify view-model assignment success
            },
            shape = RoundedCornerShape(20.dp),
            maxLines = 1,
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = MaterialTheme.colors.onBackground,
                disabledTextColor = Color.Gray,
                //backgroundColor = Color.Red , dose not work
                cursorColor = Color.Green,
                errorCursorColor = Color.Red,
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = MaterialTheme.colors.onBackground,
                focusedLabelColor = MaterialTheme.colors.onBackground,
                unfocusedLabelColor = MaterialTheme.colors.onBackground,




                ),
            // placeholder = { Text("Username")},
            label = {Text("Password")}

        )
    }

}



@Composable
fun SignUpUsernameTextField(loginSignUpViewModel: LoginSignUpViewModel)
{
    var text by remember{ mutableStateOf("")}

    TextField(value = text,
        onValueChange = { newText:String ->
        text = newText
        loginSignUpViewModel.updateSignUpUsernameText(text)
            println("Current signUpUsername is " + loginSignUpViewModel.currentSignUpUsernameText.value.toString()) // Outputs to terminal to verify view-model assignment success

    },
        singleLine = true,
    placeholder = { Text(text = "Email")})
}

@Composable
fun SignUpPasswordTextField(loginSignUpViewModel: LoginSignUpViewModel)
{
    var text by remember{ mutableStateOf("")}

    TextField(value = text,
        onValueChange = { newText:String ->
            text = newText
            loginSignUpViewModel.updateSignUpPasswordText(text)
            println("Current signUpUsernamePassword is " + loginSignUpViewModel.currentSignUpPasswordText.value.toString()) // Outputs to terminal to verify view-model assignment success

        },
        singleLine = true,
        placeholder = { Text(text = "Password")})
}


//@OptIn(ExperimentalMaterialApi::class)
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SignUpButton(loginSignUpViewModel: LoginSignUpViewModel) {

    var scope = rememberCoroutineScope()
    var context = LocalContext.current
    var nav = Intent(context, LoginSignUpRepository::class.java)

    OutlinedButton(onClick = {

        scope.launch { context.startActivity(nav) }

    }) {
        Text(text = "Sign Up")
    }
}



@Composable
fun SignInButton(loginSignUpViewModel: LoginSignUpViewModel)
{
    OutlinedButton(onClick = {
        //loginSignUpViewModel.SignInUser()

    }) {
        Text(text = "Sign In")
    }
}
