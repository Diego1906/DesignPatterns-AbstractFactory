package com.example.designerpatterns.domain

import com.example.designerpatterns.constants.Porte

// AbstractProduct
abstract class Guincho constructor(val porte: Porte) {

    abstract fun socorrer(veiculo: Veiculo)
}