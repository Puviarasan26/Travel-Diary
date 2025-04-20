package com.example.diaryforexplorers.presentation.auth.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreen(navHostController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Login in to your personal diary",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(8.dp),
            fontFamily = FontFamily.Serif
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}