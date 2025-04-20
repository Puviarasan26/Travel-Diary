package com.example.diaryforexplorers.presentation.auth.login

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.diaryforexplorers.presentation.navigation.Screen

@Composable
fun LoginScreen(navHostController: NavHostController) {
    Text(text = "Login Screen", modifier = Modifier.clickable {
        navHostController.navigate(Screen.Register.route)
    })
}