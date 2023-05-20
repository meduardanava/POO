package com.mycompany.exercicio4;

public class Gato extends Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("O gato latiu.");
    }
    
    @Override
    public void mover(){
        System.out.println("O gato de mexeu.");
    }
}
