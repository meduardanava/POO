/*
Crie uma classe abstrata "Instrumento" com método abstrato "tocar". Implemente 
as subclasses "Violão", "Piano" e "Bateria" que herdam de "Instrumento" e 
implementam o método abstrato de forma polimórfica.
 */

package com.mycompany.exercicio9;

public class Exercicio9 {

    public static void main(String[] args) {
        
        Instrumento violao = new Violao();
        violao.tocar();
        
        System.out.println(" ");
        
        Instrumento piano = new Piano();
        piano.tocar();
        
        System.out.println(" ");
        
        Instrumento bateria = new Bateria();
        bateria.tocar();
    }
}
