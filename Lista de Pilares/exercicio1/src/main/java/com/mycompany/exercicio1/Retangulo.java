package com.mycompany.exercicio1;

public class Retangulo extends Shape {
    
    public double base;
    public double altura;
    public double resultado;

    public Retangulo(double base, double altura, double resultado) {
        this.base = base;
        this.altura = altura;
        this.resultado = resultado;
    }
    
    @Override
    public void calcularArea(){
        
        resultado = base * altura;

        System.out.println("A área do retângulo é: " + resultado);
    }
    
    @Override
    public void calcularPerimetro(){
        
        resultado = 2 * (base + altura);
        
        System.out.println("O perímetro do retângulo é: " + resultado);
    }
}
