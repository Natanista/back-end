package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("Digite uma nota entra 0 e 10: ");
            Integer nota = scan.nextInt();

           while(nota > 10 || nota < 0){
               System.out.print("Digite um nota válida!(0-10): ");
               nota = scan.nextInt();
           }
            System.out.println(nota);

    }
}
