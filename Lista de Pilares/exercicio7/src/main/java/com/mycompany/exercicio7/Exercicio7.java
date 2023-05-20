/*
Crie uma classe abstrata "Funcionário" com atributo encapsulado "salário". 
Implemente as subclasses "Gerente", "Programador" e "Analista" que herdam de 
"Funcionário" e possuem atributos específicos. Utilize o encapsulamento para 
garantir o acesso aos atributos.
 */

package com.mycompany.exercicio7;

public class Exercicio7 {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Gerente", 1000);
        System.out.println("Cargo\t" + gerente.getCargo() + "\nSalario\t" + gerente.getSalario());
        
        Programador programador = new Programador("Programador", 2000);
        System.out.println("\nCargo\t" + programador.getCargo() + "\nSalario\t" + programador.getSalario());
        
        Analista analista = new Analista("Analista", 3000);
        System.out.println("\nCargo\t" + analista.getCargo() + "\nSalario\t" + analista.getSalario());
    }
}
