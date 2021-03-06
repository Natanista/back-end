package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] idades = new Integer[10];
        Integer maiorIdade = idades[0];
        Integer menorIdade = idades[0];
        Integer indexMaiorIdade = 0;
        Integer indexMenorIdade = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            idades[i] = scan.nextInt();
            if(idades[i] > maiorIdade){
                maiorIdade = idades[i];
                indexMaiorIdade = i;
            }

            if(idades[i] < menorIdade){
                menorIdade = idades[i];
                indexMaiorIdade = i;
            }

        }

        System.out.println(String.format("Maior idade: %d - posição: %dº\nMenor idade: %d - posição: %dº",maiorIdade,indexMaiorIdade,menorIdade,indexMenorIdade));
    }
}
