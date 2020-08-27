package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte

class ExecucaoAbstractFactory {

    companion object {

        fun executar() {
            val veiculosSocorro = listOf(
                VeiculoCreator.criar("Onix", Porte.Pequeno),
                VeiculoCreator.criar("Audi Q3", Porte.Medio),
                VeiculoCreator.criar("Ford RAM", Porte.Grande)
            )

            veiculosSocorro.forEach { veiculo ->
                AutoSocorro.criarAutoSocorro(veiculo).realizarAtendimento()
            }
        }
    }
}