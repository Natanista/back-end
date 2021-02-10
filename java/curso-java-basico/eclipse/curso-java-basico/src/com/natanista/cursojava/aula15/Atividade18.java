package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("É Par!");
		}else {
			System.out.println("É ímpar!");
		}
		
	}

}
