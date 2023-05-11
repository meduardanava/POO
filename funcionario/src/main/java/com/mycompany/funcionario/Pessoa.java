package com.mycompany.funcionario;

public class Pessoa {
  
    public int calcularIdadeMeses(int anoNascimento){
            
        return 12*(2023 - anoNascimento);
    }
    
    public int calcularIdadeDias(int anoNascimento){
            
        return 30*(12*(2023 - anoNascimento));
    }

}
