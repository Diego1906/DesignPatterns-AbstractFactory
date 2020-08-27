package com.example.designerpatterns.core

import com.example.designerpatterns.constants.Porte
import com.example.designerpatterns.domain.Guincho
import com.example.designerpatterns.domain.GuinchoGrande
import com.example.designerpatterns.domain.GuinchoMedio
import com.example.designerpatterns.domain.GuinchoPequeno

class GuinchoCreator {

    companion object {

        fun criar(porte: Porte): Guincho {
            return when (porte) {
                Porte.Pequeno -> GuinchoPequeno(porte)
                Porte.Medio -> GuinchoMedio(porte)
                Porte.Grande -> GuinchoGrande(porte)
            }
        }
    }
}