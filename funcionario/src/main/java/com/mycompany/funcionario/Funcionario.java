package com.mycompany.funcionario;
     
import java.util.Scanner;

public class Funcionario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Informe o ano do seu nascimento: ");
        int anoNascimento = ler.nextInt();
        
        int calculoMeses = pessoa.calcularIdadeMeses(anoNascimento);
        int calculoDias = pessoa.calcularIdadeDias(anoNascimento);
        
        System.out.println("A média de meses e dias de quem nasceu em " + anoNascimento + "é");
        System.out.println(calculoMeses + " meses.");
        System.out.println(calculoDias + " dias.");
    }
}
