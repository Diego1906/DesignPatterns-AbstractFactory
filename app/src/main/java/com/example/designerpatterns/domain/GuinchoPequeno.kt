package com.example.designerpatterns.domain

import android.widget.Toast
import com.example.designerpatterns.App
import com.example.designerpatterns.constants.Porte

// Produto Concreto
class GuinchoPequeno(porte: Porte) : Guincho(porte) {

    override fun socorrer(veiculo: Veiculo) {
        // Processo de socorro
        Toast.makeText(
            App.getContext(),
            "Socorrendo Carro Pequeno - Modelo ${veiculo.modelo}",
            Toast.LENGTH_SHORT
        ).show()
    }
}