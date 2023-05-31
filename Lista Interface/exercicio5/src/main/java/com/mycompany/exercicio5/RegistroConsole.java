package com.mycompany.exercicio5;

public class RegistroConsole implements Registravel{
    
    @Override
    public void registrar(String mensagem){
        System.out.println(mensagem);
    }
}
