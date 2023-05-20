/*
Implemente uma interface "Autenticável" com métodos "autenticar" e 
"desautenticar". Crie a classe "SistemaSeguro" que implementa a interface de 
forma polimórfica e utilize o encapsulamento para proteger os dados sensíveis.
 */

package com.mycompany.exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        int opcao;
        
        Scanner ler = new Scanner(System.in);
        
        SistemaSeguro sistema = new SistemaSeguro("Maria", "123.456.789-10");
        
        do{
            System.out.println("\nInforme o que deseja fazer seguindo a tabela");
            System.out.println("1 - Autenticar");
            System.out.println("2 - Desautenticar");
            System.out.println("3 - Sair");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 1:
                    sistema.autenticar();
                    break;
                case 2:
                    sistema.desautenticar();
                    break;
                case 3:
                    System.out.println("\nOpção inválida, tente novamente");
                    break;
                default:
                    System.out.println("\nSistema finalizado");
                    break;
            }

        }while(opcao != 3);
    }
}
