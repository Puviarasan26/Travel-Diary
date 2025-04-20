package com.example.diaryforexplorers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.diaryforexplorers.presentation.navigation.AppNavHost
import com.example.diaryforexplorers.presentation.navigation.Screen
import com.example.diaryforexplorers.presentation.ui.theme.DiaryForExplorersTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiaryForExplorersTheme {
                val navController = rememberNavController()
                val currentBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = currentBackStackEntry?.destination?.route

                Scaffold(
                    modifier = Modifier.fillMaxSize(), topBar = {
                        TopAppBar(
                            title = {
                                Text(text = getTitleForRoute(currentRoute))
                            },
                            navigationIcon = {
                                if (currentRoute != Screen.Login.route && currentRoute
                                    != Screen.Register.route
                                ) {
                                    IconButton(onClick = { navController.navigateUp() }) {
                                        Icon(
                                            Icons.Default.ArrowBack,
                                            contentDescription = "Back"
                                        )
                                    }
                                }
                            }
                        )
                    }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        AppNavHost()
                    }
                }
            }
        }
    }

    private fun getTitleForRoute(route: String?): String {
        return when (route) {
            Screen.Login.route -> "Login"
            Screen.Register.route -> "Register"
            Screen.Home.route -> "Home"
            else -> "Diary for Explorers"
        }
    }
}
