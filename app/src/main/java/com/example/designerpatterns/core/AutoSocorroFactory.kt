package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.domain.Guincho
import com.example.designerpatterns.domain.Veiculo

// Abstract Factory
abstract class AutoSocorroFactory {

    abstract fun criarGuincho(): Guincho
    abstract fun criarVeiculo(modelo: String, porte: Porte): Veiculo
}