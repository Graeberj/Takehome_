package com.graeberj.takehome_.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.graeberj.takehome_.presentation.navigation.Navigation
import com.graeberj.takehome_.presentation.ui.theme.Takehome_Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        enableEdgeToEdge()
        setContent {
            Takehome_Theme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    Navigation(navController = navController)
                }
            }
        }
    }
}



