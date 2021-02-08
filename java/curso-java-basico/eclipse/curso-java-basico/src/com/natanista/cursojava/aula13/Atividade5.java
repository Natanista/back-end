package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade5 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Valor em metros:");
			double valor = scan.nextDouble();
			double resultado = valor * 100;
			System.out.println("O valor em cm equivale a: " + resultado + "cm");
			
		} 
}
