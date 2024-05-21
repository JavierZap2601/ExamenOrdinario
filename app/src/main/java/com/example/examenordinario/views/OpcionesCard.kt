package com.example.examenordinario.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.examenordinario.models.Opciones

@Composable
fun OpcionesCard(opciones: Opciones){
    Card(modifier = Modifier.padding(8.dp)){
        Row(modifier = Modifier.fillMaxWidth()){

            Text(
                text = "Numero: #"+opciones.numero.toString(),
                modifier = Modifier.padding(top = 8.dp),
                color = Color(0xFF000000)
            )

            Spacer(modifier = Modifier.width(8.dp))
            Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.End){
                Image(
                    modifier = Modifier
                        .height(150.dp)
                        .width(120.dp),
                    painter = painterResource(id = opciones.imagen),
                    contentDescription = "Game Image",
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "Titulo:"+opciones.titulo,
                    modifier = Modifier.padding(top = 8.dp),
                    color = Color(0xFF000000)
                )
            }

        }
        //Imagen

        //Nombre del juego
        //Consola y Precio

        //Button
    }
}