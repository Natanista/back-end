package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade9 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite o valor em graus Fº: ");
			double grausF = scan.nextDouble();
			double grausC = (5 * (grausF - 32) / 9);
			System.out.println(grausF + "equivale a: " + grausC + " ºC");
			
		}
		
}
