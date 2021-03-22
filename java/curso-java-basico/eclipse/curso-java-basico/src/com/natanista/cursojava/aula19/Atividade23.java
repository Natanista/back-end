package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade23 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Integer[] vetorA = new Integer[10];

    for(int i =0; i < vetorA.length; i++){

            System.out.println(String.format("Digite o valor da posição %d: ",i));
            vetorA[i] = scan.nextInt();

            if(vetorA[i] % 2 != 0){
                System.out.println("Programa encerrado! Aceitamos apenas valores pares!");
                break;
            }

    }

    }
}
