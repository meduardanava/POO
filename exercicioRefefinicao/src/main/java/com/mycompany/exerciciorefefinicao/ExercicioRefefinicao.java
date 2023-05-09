package com.mycompany.exerciciorefefinicao;

public class ExercicioRefefinicao {

    public static void main(String[] args) {
        
        Animal animal = new Cachorro();
        animal.fazerBarulho();
        animal = new Gato();
        animal.fazerBarulho();
        
    }
}
