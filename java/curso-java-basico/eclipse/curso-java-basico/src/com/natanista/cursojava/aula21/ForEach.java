package com.natanista.cursojava.aula21;

import java.util.concurrent.ThreadLocalRandom;

public class ForEach {

    public static void main(String[] args) {
        int[] notas = new int[10];


        for(int i = 0; i < notas.length; i++){
            notas[i] = ThreadLocalRandom.current().nextInt(1,11   );
        }

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        System.out.println("Usando o for each!");
        //for each array
        for(int nota : notas){
            System.out.println(nota);
        }



    }
}
