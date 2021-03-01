package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetorA = new Integer[10];
        Integer soma = 0;

        for(int i = 1; i < vetorA.length; i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            vetorA[i] = scan.nextInt();
            if(vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.println(String.format("A soma dos vetores é de : %d",soma));


    }
}
