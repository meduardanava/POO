package com.mycompany.exerciciooverload;

public class ExercicioOverload {

    public static void main(String[] args) {
        
        int[] numeros ={10,20,30,40,50};
        
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma de dois números inteiros: " + calculadora.somar(20, 40));
        System.out.println("Soma de dois números quebrados: " + calculadora.somar(2.5, 4.2));
        System.out.println("Soma por uma array: " + calculadora.somar(numeros));
    }
}
