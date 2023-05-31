package com.mycompany.exercicio2;

public class BubbleSort implements Ordenavel {
    
    @Override
    public void ordenar(){
        
        int[]numeros = {13, 45, 10, 76, 32, 9, 67, 19};
        boolean houveTroca = true;
        
        while(houveTroca){
            
            houveTroca = false;
            
            for(int i = 0; i < numeros.length - 1; i++){
                if(numeros[i] > numeros[i+1]){
                    int aux = numeros[i];
                    numeros[i] = numeros[i+1];
                    numeros[i+1] = aux;
                    houveTroca = true;
                }
            }
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Posição [" + i + "] = " + numeros[i]);
        }
    }
}
