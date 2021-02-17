package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer numero;
        Integer soma = 0;
        Double media;

        for(int i = 0; i < 5; i++){
            System.out.print("Entre com um número: ");
            numero = scan.nextInt();
            soma += numero;
        }
        media = (double) soma / 5;

        System.out.println("Media: " + media);

    }
}
