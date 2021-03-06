package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double[] vetorA = new Double[10];
        Double soma = 0.0;

        for (int i = 1; i < vetorA.length; i++){

            System.out.println(String.format("Valor da posição %dº : ",i));
            vetorA[i] = scan.nextDouble();
            soma += vetorA[i];
        }

        Double media = soma / vetorA.length;

        System.out.println("Média: " + media);
    }
}
