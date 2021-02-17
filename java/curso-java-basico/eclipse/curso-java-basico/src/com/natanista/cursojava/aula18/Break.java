package com.natanista.cursojava.aula18;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        Integer primeiroNumero = scan.nextInt();

        System.out.print("Entre com um limite: ");
        Integer segundoNumero = scan.nextInt();

        for(int i = primeiroNumero; i < segundoNumero; i++){
            if(i % 7 == 0){
                System.out.println(i);
                break;
            }
        }



    }
}
