package com.mycompany.exemplopolimorfismo;

public class ExemploPolimorfismo {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.desenhar();
        System.out.println("Valor " + circulo.desenhar(20));
        Quadrado quadrado = new Quadrado();
        quadrado.desenhar(); 
    }
}
