package com.natanista.cursojava.aula19;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atividade20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double[] vetorA = new Double[20];
        Double cotacao = 0.0;

        System.out.println("Entre com a cotação do dollar: ");
        cotacao = scan.nextDouble();

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i + 1);

        }

        for (int i = 0; i < vetorA.length;i++){
            System.out.println(vetorA[i]);
        }

    }

}
