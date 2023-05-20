/*
Crie uma classe abstrata "Shape" com métodos abstratos "calcularÁrea" e 
"calcularPerímetro". Implemente as subclasses "Círculo", "Retângulo" e 
"Triângulo" que herdam de "Shape" e implementam os métodos abstratos 
de forma polimórfica.
*/

package com.mycompany.exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Shape circulo = new Circulo(10, 0, 0);
        circulo.calcularArea();
        circulo.calcularPerimetro();
         
        System.out.println(" ");

        Shape retangulo = new Retangulo(20, 10, 0);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        
        System.out.println(" ");
        
        Shape triangulo = new Triangulo(15, 40, 10, 10, 10, 0);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}
