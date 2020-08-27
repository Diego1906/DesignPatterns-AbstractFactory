package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.domain.Guincho
import com.example.designerpatterns.domain.Veiculo

// Concrete Factory
class AutoSocorroVeiculoPequenoFactory : AutoSocorroFactory() {

    override fun criarGuincho(): Guincho {
        return GuinchoCreator.criar(Porte.Pequeno)
    }

    override fun criarVeiculo(modelo: String, porte: Porte): Veiculo {
        return VeiculoCreator.criar(modelo, porte)
    }
}