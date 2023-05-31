/*
Crie uma interface chamada Criptografavel com dois métodos: criptografar(String dados) 
e descriptografar(String dadosCriptografados). Em seguida, implemente essa interface 
em uma classe chamada AESCryptografia que utiliza o algoritmo de criptografia AES para 
criptografar e descriptografar dados.
*/
package com.mycompany.exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        
        AESCryptografia crypto = new AESCryptografia();
        
        crypto.criptografar("\n65, 32, 108, 117, 97, 32, 233, 32, 114, 101, 100, "
                + "\n111, 110, 100, 97, 32, 114, 101, 100, 111, 110, 100, 97, 32, "
                + "\n99, 111, 109, 111, 32, 117, 109, 32, 116, 97, 109, 97, 110, "
                + "\n99, 111, 44, 32, 98, 97, 110, 97, 110, 97, 32, 110, 227, 111, "
                + "\n32, 116, 101, 109, 32, 99, 97, 114, 111, 231, 111, 44, 32, 118, "
                + "\n101, 110, 100, 105, 32, 109, 105, 110, 104, 97, 32, 98, 105, 99, "
                + "\n105, 99, 108, 101, 116, 97, 0, 0, 0, 0, 0");
        
        System.out.println(" ");
        
        crypto.descriptografar("\nA lua é redonda redonda como um tamanco, banana não tem caroço, vendi minha bicicleta.");
    }
}
