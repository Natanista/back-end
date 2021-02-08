package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade10 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.print("Digite o valor em Fahrenheit: ");
			double grausF = scan.nextDouble();
			double grausC = grausF * 1.8 + 32;
			System.out.println(grausF + "ºF equivalem a: " + grausC + " ºC");
			
			
		}
		
}
