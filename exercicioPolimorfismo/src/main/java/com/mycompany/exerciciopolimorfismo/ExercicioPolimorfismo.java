package com.mycompany.exerciciopolimorfismo;

import java.util.ArrayList;

public class ExercicioPolimorfismo {

    public static void main(String[] args) {
        
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Veiculo carro = new Carro();
        Veiculo aviao = new Aviao();
        
        listaVeiculos.add(carro);
        listaVeiculos.add(aviao);
        
        for(int i = 0; i < listaVeiculos.size(); i++){
            listaVeiculos.get(i).mover();
        }
        
        /*
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro();
        veiculos[1] = new Aviao();
        
        for(Veiculo veiculo : veiculos){
            veiculo.mover();
        }
        */
    }
}
