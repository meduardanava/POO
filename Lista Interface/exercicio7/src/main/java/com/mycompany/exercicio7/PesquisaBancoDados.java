package com.mycompany.exercicio7;

public class PesquisaBancoDados implements Pesquisavel{
    
    @Override
    public void pesquisar(String palavraChave){
        System.out.println(" Registro de Dados: " + palavraChave);
    }
}
