package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numero;
        Integer maior = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            System.out.print("Entre com um número: ");
            numero = scan.nextInt();
            if(numero > maior){
                maior = numero;
            }

        }
        System.out.println("O maior: " + maior);
    }
}
