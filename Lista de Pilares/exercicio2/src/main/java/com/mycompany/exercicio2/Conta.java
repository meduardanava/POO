package com.mycompany.exercicio2;

public class Conta extends Transacao{
    
    public double saldo;
    public String titular;

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    @Override
    public void depositar(double valor){
        if(valor > 0 ){
            
            saldo = saldo + valor;
            System.out.println("O saldo atual se elaborando um deposito de " + valor + " é: " + saldo);
        }else{
            System.out.println("Não é possível fazer esse deposito.");
        }
    }
    
    @Override
    public void sacar(double valor){
        if(valor < saldo){
            saldo = saldo - valor;
            System.out.println("O saldo atual se elaborando um saque de " + valor + " é: " + saldo);
        }else{
            System.out.println("Não é possível fazer esse saque.");
        }
    }
    
    public void obterSaldo(){
        System.out.println("A conta do titular " +getTitular());
        System.out.println("Saldo da conta " + getSaldo());
    }
}
