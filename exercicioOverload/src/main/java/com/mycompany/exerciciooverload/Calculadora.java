package com.mycompany.exerciciooverload;

import java.util.Arrays;

public class Calculadora {
    
    public int somar(int a, int b){
        return a + b;
    }
    
    public double somar(double a, double b){
        return a + b;
    }
    
    public int somar(int[] numeros){
        return Arrays.stream(numeros).sum();
    }
}
