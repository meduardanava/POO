package com.mycompany.exercicio6;

public class AESCryptografia implements Criptografavel {
    
    @Override
    public void criptografar(String dados){
        System.out.println("Mensagem criptografada: " + dados);
    }
    
    @Override
    public void descriptografar(String dadosCriptografados){
    
        
        System.out.println("Mensagem descriptografada: " + dadosCriptografados);
    }
}
