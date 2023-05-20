/*
Implemente uma classe "Conta" com atributos encapsulados "saldo" e "titular". 
Crie métodos para depositar, sacar e obter saldo, garantindo o encapsulamento 
dos atributos. Utilize o conceito de abstração para tratar a transação de 
depósito e saque.
 */

package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        
        Conta conta = new Conta(100, "Maria");
        System.out.println("" + conta.getTitular());
        System.out.println("" + conta.getSaldo());
        conta.depositar(50);
        conta.sacar(10);
    }
}
