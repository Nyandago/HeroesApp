package com.cannybits.heroesapp.presentation.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.cannybits.heroesapp.R
import com.cannybits.heroesapp.ui.theme.Purple500
import com.cannybits.heroesapp.ui.theme.Purple700

@Composable
fun SplashScreen(navController: NavHostController){

Splash()

}


@Composable
fun Splash(){
    Box(modifier = Modifier
        .background(Brush.verticalGradient(listOf(Purple700, Purple500)))
        .fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = stringResource(R.string.app_logo)
                    )
    }

}

@Preview
@Composable
fun SplashScreenPreview() {
 Splash()
}