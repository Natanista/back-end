package com.natanista.cursojava.aula19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetorA = new Integer[10];
        Integer pares = 0;

        for(int i = 1; i <       vetorA.length;i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 2 == 0){
                pares++;
            }
        }

        System.out.println(String.format("Quantidade de pares: %d", pares));
    }
}
