package com.mycompany.exercicio7;

public class Analista extends Funcionario{
    
    private String cargo;

    public Analista(String cargo, double salario) {
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
