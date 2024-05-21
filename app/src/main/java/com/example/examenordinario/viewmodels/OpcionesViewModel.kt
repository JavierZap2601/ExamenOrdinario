package com.example.examenordinario.viewmodels

import androidx.lifecycle.ViewModel
import com.example.examenordinario.R
import com.example.examenordinario.models.Opciones

class OpcionesViewModel: ViewModel(){
    init {}

    fun getOpcionesList(): ArrayList<Opciones> {

        var opcionList: ArrayList<Opciones> = ArrayList<Opciones>()
        opcionList.add(Opciones(1, "Adivina la edad", R.drawable.pastel))
        opcionList.add(Opciones(2, "Gatos", R.drawable.gato))
        opcionList.add(Opciones(3, "NBA", R.drawable.nba))
        opcionList.add(Opciones(4, "Chuck Norris", R.drawable.chuck))

        return opcionList
    }
}