package inoxoft.simon.myapplication.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun navigation(modifier: Modifier){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){LoginScreen(modifier,navController)}
        composable("home"){HomeScreen(modifier,navController)}
    }
    )

}