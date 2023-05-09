package com.mycompany.redefinicaometodos;

public class RedefinicaoMetodos {

    public static void main(String[] args) {
        
        Animal animal = new Cachorro();
        animal.emitirSom();
        animal = new Gato();
        animal.emitirSom();
        animal = new Elefante();
        animal.emitirSom();
    }
}
