package com.mycompany.exercicio1;

public class Circulo extends Shape {
    
    public double raio;
    public double pi ;
    public double resultado;

    public Circulo(double raio, double pi, double resultado) {
        this.raio = raio;
        this.pi = 3.141592653589793;
        this.resultado = resultado;
    }

    @Override
    public void calcularArea(){
        
        resultado = pi * (raio * raio); 

        System.out.println("A área do cículo é: " + resultado);
    }
    
    @Override
    public void calcularPerimetro(){
        
        resultado = 2 * raio * pi; 
        
        System.out.println("O perímetro do cículo é: " + resultado);
    }
}
