package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.core.AutoSocorroFactory
import com.example.designerpatterns.core.GuinchoCreator
import com.example.designerpatterns.core.VeiculoCreator
import com.example.designerpatterns.domain.Guincho
import com.example.designerpatterns.domain.Veiculo

// Concrete Factory
class AutoSocorroVeiculoMedioFactory : AutoSocorroFactory() {

    override fun criarGuincho(): Guincho {
        return GuinchoCreator.criar(Porte.Medio)
    }

    override fun criarVeiculo(modelo: String, porte: Porte): Veiculo {
        return VeiculoCreator.criar(modelo, porte)
    }
}