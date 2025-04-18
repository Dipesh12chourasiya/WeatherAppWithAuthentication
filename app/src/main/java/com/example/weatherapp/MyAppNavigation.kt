package com.example.weatherapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.pages.LoginPage
import com.example.weatherapp.pages.SignupPage


@Composable
fun MyAppNavigation(modifier: Modifier, authVIewModel: AuthVIewModel, weatherViewModel: WeatherViewModel){
    val navController =  rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable(route = "login") {
            LoginPage(modifier, navController, authVIewModel)
        }
        composable(route = "signup") {
            SignupPage(modifier, navController, authVIewModel)
        }
        composable(route = "home") {
            WeatherPage(weatherViewModel, navController, authVIewModel)
        }
    })
}