package com.example.diaryforexplorers.presentation.auth.register

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.diaryforexplorers.presentation.navigation.Screen

@Composable
fun RegisterScreen(navHostController: NavHostController) {
    Text(text = "Register Screen", modifier = Modifier.clickable {
        navHostController.navigate(Screen.Home.route)
    })
}
