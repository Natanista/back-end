package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numero = 0;
        Integer impar = 0;
        Integer par = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print("Entre com um inteiro: ");
            numero = scan.nextInt();
            if(numero % 2 != 0){
                impar++;
            }else{
                par++;
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
