/*
Implemente uma interface "Mídia" com método "reproduzir". Crie as classes "CD", 
"DVD" e "Blu-ray" que implementam a interface de forma polimórfica.
*/
package com.mycompany.exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Midia cd = new CD();
        cd.reproduzir();
        
        System.out.println(" ");
        
        Midia dvd = new DVD();
        dvd.reproduzir();
        
        System.out.println(" ");
        
        Midia bluray = new BluRay();
        bluray.reproduzir();
    }
}
