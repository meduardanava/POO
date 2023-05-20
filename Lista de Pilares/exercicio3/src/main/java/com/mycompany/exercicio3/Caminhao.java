package com.mycompany.exercicio3;

public class Caminhao implements Veiculo{
    
    @Override
    public void acelerar(){
        System.out.println("O caminhão acelerou.");
    }
    
    @Override
    public void frear(){
        System.out.println("O caminhão freio.");
    }
}
