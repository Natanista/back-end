package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base: ");
        Integer base = scan.nextInt();

        System.out.print("Digite a potencia: ");
        Integer potencia = scan.nextInt();

        Integer resultado = base;

        for(int i = 1; i < potencia;i++){
            resultado *= base;
        }
        System.out.println(resultado);
    }
}
