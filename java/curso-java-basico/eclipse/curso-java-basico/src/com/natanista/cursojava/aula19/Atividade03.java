package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetorA = new Integer[8];
        Integer[] vetorB = new Integer[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            vetorA[i] = scan.nextInt();
            vetorB[i] =  vetorA[i] * vetorA[i];
        }

        for (int i = 0; i < vetorA.length; i ++){
            System.out.println(String.format("Valor de A na posição %d : %d\nValor de B na posição %d: %d",i,vetorA[i],i,vetorB[i]));
        }

    }
}
