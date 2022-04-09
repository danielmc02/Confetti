package com.example.confetti.View.d


import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.confetti.R
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.SignUpScreen
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_components.LoginTextField
import com.example.confetti.View.Screens.LoginScreen_SignUpScreen.login_components.PasswordTextField
import com.example.confetti.ViewModels.LoginSignUpViewModel
import com.example.confetti.ui.theme.ConfettiTheme
import kotlinx.coroutines.launch


val CustomFont = FontFamily(
    Font(R.font.chewy_regular , weight = FontWeight.Light)
)

@ExperimentalMaterialApi
@Composable
fun LoginScreen(modifier: Modifier, loginSignUpViewModel: LoginSignUpViewModel){

    ConfettiTheme() {
        val scope = rememberCoroutineScope()
        var drawerState = rememberBottomDrawerState(initialValue = BottomDrawerValue.Closed)
            BottomDrawer(drawerState =  drawerState ,gesturesEnabled = false, drawerContent = { SignUpScreen(LoginSignUpViewModel(), drawerState = drawerState, scope = scope) })
            {
                Column(

                    modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colors.background)) {

                    Row(
                        modifier
                            .fillMaxWidth()
                            .weight(.2f),
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Center) {
                        //Top-Title
                        Text(text = "Confetti",
                            fontSize = 80.sp,
                            color = MaterialTheme.colors.onBackground,
                            fontFamily = CustomFont
                        )

                    }
                    Column(
                        modifier
                            .fillMaxWidth()
                            .weight(.5f)
                            .background(Color.Transparent)) {
                        //Body for sign in components

                        Column(
                            modifier
                                .fillMaxWidth()
                                .weight(.9f),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            //Body for text fields
                            LoginTextField(LoginSignUpViewModel())
                            Spacer(modifier.height(20.dp))
                            PasswordTextField(LoginSignUpViewModel())
                            Spacer(modifier.height(20.dp))
                            //LoginFormComposable()
                            Text(modifier = Modifier.clickable { scope.launch { drawerState.expand() } },text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = MaterialTheme.colors.onSurface,

                                        )
                                ){
                                    append("Don't have an account?")
                                }
                            })




                        }

                    }
                    Row(
                        modifier
                            .fillMaxWidth()
                            .weight(.3f),
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Start) {
                        //Dont have an account, sign up
                    }
            }




        }
    }

}

@ExperimentalMaterialApi
@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PreviewScreen(){
    LoginScreen(modifier = Modifier, LoginSignUpViewModel())
}


