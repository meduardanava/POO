/*
 Implemente uma classe abstrata "Animal" com métodos abstratos "emitirSom" e 
"mover". Crie as subclasses "Cachorro", "Gato" e "Passarinho" que herdam de 
"Animal" e implementam os métodos abstratos de forma polimórfica.
 */

package com.mycompany.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.mover();
        
        System.out.println(" ");
                
        Animal gato = new Gato();
        gato.emitirSom();
        gato.mover();
        
        System.out.println(" ");
        
        Animal passarinho = new Passarinho();
        passarinho.emitirSom();
        passarinho.mover();
    }
}
