package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um inteiro: ");
        Integer num1 = scan.nextInt();
        num1++;

        System.out.print("Digite outro inteiro: ");
        Integer num2 = scan.nextInt();

        for(int i = num1; i < num2; i++){
            System.out.println(i);
        }
    }
}
