package com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme


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
        OutlinedTextField(
            value = text,
            onValueChange = { newText:String ->
                text = newText // Assigning temporary state holder value
                loginSignUpViewModel.updateUsernameReference(text) // Updates the actual text via view-model
                println(loginSignUpViewModel.currentUsernameText.value.toString()) // Outputs to terminal to verify view-model assignment success
            },
            shape = RoundedCornerShape(20.dp),
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
        OutlinedTextField(
            value = text,
            onValueChange = { newText:String ->
                text = newText // Assigning temporary state holder value
                loginSignUpViewModel.updatePasswordReference(text) // Updates the actual text via view-model
                println(loginSignUpViewModel.currentPasswordText.value.toString()) // Outputs to terminal to verify view-model assignment success
            },
            shape = RoundedCornerShape(20.dp),
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
        println(loginSignUpViewModel.currentSignUpUsernameText)

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
            println(loginSignUpViewModel.currentSignUpPasswordText)

        },
        singleLine = true,
        placeholder = { Text(text = "Password")})
}


@Composable
fun SignUpButton(loginSignUpViewModel: LoginSignUpViewModel)
{
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Sign Up")
    }
}