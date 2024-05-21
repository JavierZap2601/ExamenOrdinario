package com.example.examenordinario.handlers

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examenordinario.views.AdivinaLaEdad
import com.example.examenordinario.views.HomeView

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeView") {

        //Renderizar las pantallas definiendo el nombre de su ruta
        composable(route = "HomeView") {
            HomeView(navController)
        }
        composable(route = "Edad") {
            AdivinaLaEdad(navController)
        }
    }
}