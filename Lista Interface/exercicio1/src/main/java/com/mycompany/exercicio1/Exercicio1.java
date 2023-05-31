/*
Crie uma interface chamada Desenhavel com um método desenhar() que não retorna 
nada. Em seguida, implemente essa interface em três classes diferentes: Circulo, 
Retangulo e Triangulo. Cada classe deve implementar o método desenhar() para 
exibir o nome da forma geométrica correspondente.
 */

package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}
