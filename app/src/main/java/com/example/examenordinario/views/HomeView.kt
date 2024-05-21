package com.example.examenordinario.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.examenordinario.viewmodels.OpcionesViewModel

@Composable
fun HomeView(navController: NavHostController) {
    val opcionesViewModel = OpcionesViewModel()
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn() {
            items(opcionesViewModel.getOpcionesList()) { opcion ->
                OpcionesCard(opcion)
            }
        }
        Button(onClick = { navController.navigate("Edad") }) {
            Text("Adivinar la Edad")
        }
    }
}




