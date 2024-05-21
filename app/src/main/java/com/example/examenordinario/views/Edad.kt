package com.example.examenordinario.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AdivinaLaEdad(navController: NavHostController){
    var ano: String  by remember { mutableStateOf("") }
    var edad: Int  by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text="Ingrese su Año de Nacimiento")

        OutlinedTextField(
            value = ano,
            onValueChange = {ano = it},
            label = { Text("Año") }
        )
        Button(onClick = {
            edad = 2024 - ano.toInt()
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = androidx.compose.ui.graphics.Color.Blue
            )
        ) {
            Text(text="Calcular Edad")
        }
        if(ano.isNotEmpty()){
            Text(text="Su edad es $edad",
                modifier = Modifier.fillMaxSize(),
                textAlign = TextAlign.Center,
                color = Color(color = 0xFF9C27B0)
            )
        }
        Button(onClick = { navController.navigate("HomeView") }) {
            Text("<<")
        }

    }
}

@Composable
@Preview(showBackground = true)
fun AdivinaLaEdadPreview(){
    AdivinaLaEdad(navController = rememberNavController())
}