package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetor = new Integer[10];
        Integer somaInferiorA15 = 0;
        Integer quinzenas = 0;
        Integer somaSuperiorA15 = 0;
        Integer quantidadeSuperiorA15 = 0;

        for(int i = 1; i < vetor.length; i++){
            System.out.println(String.format("Valor da posição %d", i));
            vetor[i] = scan.nextInt();

            if(vetor[i] < 15){
                somaInferiorA15 += vetor[i];
            }
            if(vetor[i] == 15){
                quinzenas++;
            }
            if (vetor[i] > 15){
                somaSuperiorA15 += vetor[i];
                quantidadeSuperiorA15++;
            }

        }
        Double mediaSuperioresA15 = (double) somaSuperiorA15 / quantidadeSuperiorA15;

        System.out.println(String.format("Soma dos inferiores a 15: %d\nQuantidade de 15s: %d\nMédia dos superiores a 15: %.2f", somaInferiorA15, quinzenas,mediaSuperioresA15));
    }
}
