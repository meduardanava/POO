/*
Crie uma interface chamada Pesquisavel com um método pesquisar(String palavraChave) 
que realiza uma pesquisa em um determinado recurso (por exemplo, um banco de dados). 
Em seguida, implemente essa interface em uma classe chamada PesquisaBancoDados que 
realiza uma pesquisa em um banco de dados.
 */

package com.mycompany.exercicio7;

public class Exercicio7 {

    public static void main(String[] args) {
        
        PesquisaBancoDados pesquisaBancoDados = new PesquisaBancoDados();
        
        pesquisaBancoDados.pesquisar("SEM-DADOS");
    }
}
