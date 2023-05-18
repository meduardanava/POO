package com.mycompany.exemplopolimorfismo;

public class Circulo extends Forma{
    
    @Override
    public void desenhar(){
        System.out.println("Desenhando círculo");
    }
    
    public int desenhar(int a){
        return a;
    }
        
}
