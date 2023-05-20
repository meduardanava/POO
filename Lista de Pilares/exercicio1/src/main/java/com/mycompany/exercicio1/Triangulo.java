package com.mycompany.exercicio1;

public class Triangulo extends Shape{
    
    public double base;
    public double altura;
    public double ladoUm;
    public double ladoDois;
    public double ladoTres;
    public double resultado;

    public Triangulo(double base, double altura, double ladoUm, double ladoDois, double ladoTres, double resultado) {
        this.base = base;
        this.altura = altura;
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
        this.ladoTres = ladoTres;
        this.resultado = resultado;
    }
    
    @Override
    public void calcularArea(){
        
    resultado = 2 / (base*altura);

    System.out.println("A área do triângulo é: " + resultado);
    }
    
    @Override
    public void calcularPerimetro(){
        
    resultado = ladoUm + ladoDois + ladoTres;
        
    System.out.println("O perímetro do triângulo é: " + resultado);
    }
}
