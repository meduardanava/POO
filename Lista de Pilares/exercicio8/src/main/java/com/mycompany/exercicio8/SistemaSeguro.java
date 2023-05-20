package com.mycompany.exercicio8;

public class SistemaSeguro implements Autenticavel{
    
    private String nome;
    private String cpf;

    public SistemaSeguro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void autenticar(){
        System.out.println("\nNome\t" + getNome() + "\nCPF\t" + getCpf());
    }
    
    @Override
    public void desautenticar(){
        System.out.println("\nDados Removidos");
    }
}
