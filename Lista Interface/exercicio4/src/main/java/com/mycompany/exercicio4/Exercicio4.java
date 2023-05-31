/*
Crie uma interface chamada Redimensionavel com um método redimensionar(double fator) 
que redimensiona um objeto geométrico. Em seguida, implemente essa interface em 
uma classe chamada Circulo para redimensionar o raio do círculo pelo fator fornecido
 */

package com.mycompany.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        
        circulo.redimencionar(14.5);
    }
}
