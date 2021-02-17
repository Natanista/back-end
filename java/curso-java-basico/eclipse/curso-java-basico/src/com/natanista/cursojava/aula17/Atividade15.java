package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com o número: ");
        Integer numero = scan.nextInt();
        Integer proximo = 0;
        Integer primeiro = 1;
        Integer segundo = 1;

        System.out.println(primeiro);
        System.out.println(segundo);

        for(int i = 3; i < numero; i++){
        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
        System.out.println(proximo);
        }

    }
}
