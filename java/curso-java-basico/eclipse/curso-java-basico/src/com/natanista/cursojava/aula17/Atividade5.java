package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qtd pessoas população A: ");
        Double populacaoA = scan.nextDouble();

        System.out.println("Qtd pessoas população B: ");
        Double populacaoB = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento da pop A: ");
        Double taxaA = scan.nextDouble();

        System.out.println("Digite a taxa de crescimento da pop B: ");
        Double taxaB = scan.nextDouble();

        Integer cont = 0;
        while(populacaoA <= populacaoB){
            populacaoA += (populacaoA/100) * taxaA;
            populacaoB += (populacaoB/100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade anos: " + cont);
    }
}
