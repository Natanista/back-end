package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número para descobrir o fatorial: ");
        Integer numero = scan.nextInt();

        System.out.println(numero + "! = ");

        Integer fatorial = 1;

        for(int i = numero; i > 0; i--){
            fatorial *= i;
            System.out.print(i + ", ");
        }
        System.out.println("Resultado: " + fatorial);
    }
}
