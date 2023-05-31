/*
Crie uma interface chamada Armazenavel com dois métodos: salvar() e carregar(). 
Em seguida, implemente essa interface em uma classe chamada ArquivoCache que 
salva e carrega dados de um arquivo no sistema de arquivos.
 */

package com.mycompany.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        
        ArquivoCache arquivoCache = new ArquivoCache();
        
        arquivoCache.salvar();
        arquivoCache.carregar();
    }
}
