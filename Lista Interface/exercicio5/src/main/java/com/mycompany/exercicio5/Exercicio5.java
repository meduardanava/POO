/*
Crie uma interface chamada Registravel com um método registrar(String mensagem) 
que registra uma mensagem de log. Em seguida, implemente essa interface em uma 
classe chamada RegistroConsole que exibe a mensagem de log no console.
 */

package com.mycompany.exercicio5;

public class Exercicio5 {

    public static void main(String[] args) {
        
        RegistroConsole registroConsole = new RegistroConsole();

        registroConsole.registrar("WARNING!");
    }
}
