package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero = scan.nextDouble();
		
		if(numero < 0) {
			System.out.println("Número negativo");
		}else {
			System.out.println("Número positivo");
		}

	}

}
