package com.natanista.cursojava.aula19;

import java.util.concurrent.ThreadLocalRandom;

public class Atividade22 {

    public static void main(String[] args) {
        Integer[] vetorA = new Integer[10];
        Double porcentagem1 = 0.0;


        for(int i = 0; i < vetorA.length;i++){
            vetorA[i] = ThreadLocalRandom.current().nextInt(0,2);
            System.out.println(vetorA[i]);
            if(vetorA[i] == 1){
                porcentagem1 += 10;
            }

        }

        System.out.println("Porcentagem de zeros: " + (100 - porcentagem1) + "%");
        System.out.println("Porcentagem de 1: " + porcentagem1 + "%");
    }
}
