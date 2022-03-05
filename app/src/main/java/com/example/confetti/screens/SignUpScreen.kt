package com.example.confetti.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.confetti.R
import com.example.confetti.ui.theme.ConfettiTheme


@Preview(uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SignUpScreen(){
    val CustomFont = FontFamily(
        Font(R.font.chewy_regular , weight = FontWeight.Light)
    )
    ConfettiTheme() {


    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background)
            ) {
        Row(modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
            ) {
            Text(text = "Sign Up", fontFamily = CustomFont, fontSize = 50.sp, color = MaterialTheme.colors.onBackground )
        }

    }
    }

}
