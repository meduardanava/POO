package com.mycompany.exercicio3;

public class ArquivoCache implements Armazenavel{
    
    @Override
    public void salvar(){
        System.out.println("Arquivos salvos.");
    }
    
    @Override
    public void carregar(){
        System.out.println("Arquivos carregados.");
    }
}
