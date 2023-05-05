package com.example.jetpackcomposenavigation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposenavigation.navigation.AppScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController: NavController, text: String){
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = {Text(
                "Second Screen",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )},

            navigationIcon = {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Volver atrás"
                    )
                }
            },
        )
    }) {
        SecondBodyContent(navController, text)
    }
}

@Composable
fun SecondBodyContent(navController: NavController, text: String){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Tu segunda Pantalla")
        Text(text)
        Button(onClick = { navController.popBackStack() }) {
            Text("Ir atras")
        }
    }
}