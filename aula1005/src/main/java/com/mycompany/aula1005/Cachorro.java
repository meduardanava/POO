package com.mycompany.aula1005;

public class Cachorro extends Animal {
    
    @Override
    public void emitirSom(){
        System.out.println("O cachorro latiu");
    }
    
    @Override
    public void mover(){
        System.out.println("O cachorro correu");
    }
}
