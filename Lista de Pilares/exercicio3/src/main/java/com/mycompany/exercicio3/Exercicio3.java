/*
 Crie uma interface "Veiculo" com métodos "acelerar" e "frear". Implemente as 
classes "Carro", "Moto" e "Caminhão" que implementam a interface de forma 
polimórfica. Utilize herança para compartilhar atributos e métodos comuns entre 
as classes.
 */

package com.mycompany.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.acelerar();
        carro.frear();
        
        System.out.println(" ");
        
        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        
        System.out.println(" ");
        
        Caminhao caminhao = new Caminhao();
        caminhao.acelerar();
        caminhao.frear();
        
    }
}
