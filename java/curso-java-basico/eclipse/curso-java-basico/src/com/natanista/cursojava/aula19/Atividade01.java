package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetorA = new Integer[5];
        Integer[] vetorB = new Integer[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){

            System.out.println("Entre com o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];

        }

        for (int i = 0; i < vetorA.length;i++){
            System.out.println(String.format("A na posição %d : %d\nB na posição %d : %d",i,vetorA[i],i,vetorB[i]));
        }
    }
}
