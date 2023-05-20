package com.mycompany.exercicio3;

public class Moto implements Veiculo{
    
    @Override
    public void acelerar(){
        System.out.println("A moto acelerou.");
    }
    
    @Override
    public void frear(){
        System.out.println("A moto freio.");
    }
}
