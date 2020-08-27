package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.domain.Veiculo
import com.example.designerpatterns.domain.VeiculoGrande
import com.example.designerpatterns.domain.VeiculoMedio
import com.example.designerpatterns.domain.VeiculoPequeno

class VeiculoCreator {

    companion object {

        fun criar(modelo: String, porte: Porte): Veiculo {
            return when (porte) {
                Porte.Pequeno -> VeiculoPequeno(modelo, porte)
                Porte.Medio -> VeiculoMedio(modelo, porte)
                Porte.Grande -> VeiculoGrande(modelo, porte)
            }
        }
    }
}