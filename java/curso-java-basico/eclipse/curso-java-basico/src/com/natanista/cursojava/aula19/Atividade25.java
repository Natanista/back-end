package com.natanista.cursojava.aula19;

import java.util.concurrent.ThreadLocalRandom;

public class Atividade25 {

    public static void main(String[] args) {

        Integer[] vetorA = new Integer[10];
        Integer[] vetorB = new Integer[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = ThreadLocalRandom.current().nextInt(1,101);
            if(vetorA[i] % 2 == 0){
                vetorB[i] = 1;
            }else{
                vetorB[i] = 0;
            }
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorB[i] + " ");
        }
    }
}
