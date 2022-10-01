package com.cannybits.heroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cannybits.heroesapp.navigation.SetupNavGraph
import com.cannybits.heroesapp.ui.theme.HeroesAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroesAppTheme {
                
                navController = rememberNavController()
                SetupNavGraph(navController = navController)

            }
        }
    }
}
