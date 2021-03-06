package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Integer[] vetorA = new Integer[10];
    Integer somaImpar = 0;
    Integer somaPar = 0;

    for(int i = 1; i < vetorA.length; i++){
        System.out.println(String.format("Didite o valor da posição %d",i));
        vetorA[i] = scan.nextInt();
        if(vetorA[i] % 2 == 0){
            somaPar++;
        }else{
            somaImpar++;
        }
    }

    Double percentualPar = (double)(somaPar * 100) / vetorA.length;
    Double percentualImpares = 100 - percentualPar;

        System.out.println(String.format("%% pares: %d\n%% impares: %d",percentualPar,percentualImpares));


    }
}
