package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.domain.Guincho
import com.example.designerpatterns.domain.Veiculo

class AutoSocorro(private val factory: AutoSocorroFactory, private val veiculo: Veiculo) {

    private val _veiculo: Veiculo by lazy {
        factory.criarVeiculo(veiculo.modelo, veiculo.porte)
    }
    private val guincho: Guincho by lazy {
        factory.criarGuincho()
    }

    fun realizarAtendimento() {
        guincho.socorrer(_veiculo)
    }

    companion object {

        fun criarAutoSocorro(veiculo: Veiculo): AutoSocorro {
            return when (veiculo.porte) {
                Porte.Pequeno -> AutoSocorro(AutoSocorroVeiculoPequenoFactory(), veiculo)
                Porte.Medio -> AutoSocorro(AutoSocorroVeiculoMedioFactory(), veiculo)
                Porte.Grande -> AutoSocorro(AutoSocorroVeiculoGrandeFactory(), veiculo)
            }
        }
    }
}