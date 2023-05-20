package com.mycompany.exercicio7;

public class Gerente extends Funcionario{
    
    private String cargo;

    public Gerente(String cargo, double salario) {
        super(salario);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
