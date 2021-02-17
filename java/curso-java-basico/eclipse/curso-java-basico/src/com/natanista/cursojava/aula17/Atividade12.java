package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número(1-10): ");
        Integer numero = scan.nextInt();

        for(int i = 1; i <= 10;i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
