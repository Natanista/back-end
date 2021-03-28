package com.natanista.cursojava.aula19;

import java.util.concurrent.ThreadLocalRandom;

public class Atividade26 {
    public static Integer gerarRandom(Integer a, Integer b){
        Integer random = ThreadLocalRandom.current().nextInt(a,b);
        return random;
    }
    public static void main(String[] args) {

        Integer[] vetorA = new Integer[10];
        Integer[] vetorB = new Integer[vetorA.length];
        Integer[] vetorC = new Integer[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = gerarRandom(1,100);
            vetorB[i] = gerarRandom(1,100);

            if(vetorA[i] > vetorB[i]){
                vetorC[i] = 1;
            }else if(vetorA[i] == vetorB[i]){
                vetorC[i] = 0;
            }else if(vetorB[i] > vetorA[i]){
                vetorC[i] = -1;
            }
        }

        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorC[i] + " ");
        }


    }
}
