package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetorA = new Integer[3];
        Integer[] vetorB = new Integer[vetorA.length];
        Double[] vetorC = new Double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            vetorA[i] = scan.nextInt();
            vetorB[i] =  vetorA[i];
            vetorC[i] = (double) vetorA[i] / vetorB[i];
        }

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println(String.format("Valor de A na posição %d : %d\nValor de B na posição %d: %d\nValor de C na posição %d: %.2f",i,vetorA[i]
                    ,i,vetorB[i],i,vetorC[i]));
        }

    }
}
