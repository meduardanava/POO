package com.mycompany.exercicio4;

public class Circulo implements Redimensionavel {
    
    @Override
    public void redimencionar(double fator){
        System.out.println("O raio do círculo é " + fator);
    }
}
