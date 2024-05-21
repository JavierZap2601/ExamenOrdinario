package com.example.examenordinario.models

import androidx.annotation.DrawableRes

data class Opciones(
    var numero: Int,
    var titulo: String,
    @DrawableRes var imagen: Int
)
