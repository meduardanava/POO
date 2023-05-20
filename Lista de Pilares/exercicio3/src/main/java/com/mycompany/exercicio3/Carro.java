package com.mycompany.exercicio3;

public class Carro implements Veiculo{
    
    @Override
    public void acelerar(){
        System.out.println("O carro acelerou.");
    }
    
    @Override
    public void frear(){
        System.out.println("O carro freio.");
    }
}
