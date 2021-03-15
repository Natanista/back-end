package com.natanista.cursojava.aula20;

import java.util.concurrent.ThreadLocalRandom;

public class Atividade01 {

    public static void main(String[] args) {

        Integer[][] numerosAleatorios = new Integer[4][4];

        Integer numeroRandom = ThreadLocalRandom.current().nextInt(1,101);

        for(int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom;
            }
        }

        Integer maiorNumero = 0;
        Integer linha = 0;
        Integer coluna = 0;

        for(int i = 0; i < numerosAleatorios.length; i++){
            for (int j = 0; j < numerosAleatorios[i].length; j++){
               if(numerosAleatorios[i][j] > maiorNumero){
                   maiorNumero = numerosAleatorios[i][j];
                   linha  = i;
                   coluna = j;
               }
            }
        }

        System.out.println(String.format("maior valor: %d",maiorNumero));
        System.out.println(String.format("linha: %d",linha));
        System.out.println(String.format("coluna: %d",coluna));

    }
}
