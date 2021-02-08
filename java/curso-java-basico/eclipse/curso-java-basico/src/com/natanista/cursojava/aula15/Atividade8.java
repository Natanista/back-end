package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do produto 1: ");
		double valor1 = scan.nextDouble();

		System.out.println("Digite o valor do produto 2: ");
		double valor2 = scan.nextDouble();

		System.out.println("Digite o valor do produto 3: ");
		double valor3 = scan.nextDouble();

		if (valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("Compre o produto 1");
		} else if (valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("Compre o produto 2");
		} else if (valor3 <= valor2 && valor3 <= valor1) {
			System.out.println("Compre o produto 3");
		}

	}

}
