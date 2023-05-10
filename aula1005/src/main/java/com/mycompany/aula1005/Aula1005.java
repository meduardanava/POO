package com.mycompany.aula1005;

public class Aula1005 {

    public static void main(String[] args) {
        
        Animal animal = new Cachorro();
        animal.emitirSom();
        animal.mover();
        
        animal = new Gato();
        animal.emitirSom();
        animal.mover();
    }
}
