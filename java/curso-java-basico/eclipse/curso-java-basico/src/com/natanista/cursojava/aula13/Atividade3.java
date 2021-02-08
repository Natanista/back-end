package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número:");
		int num1 = scan.nextInt();
		System.out.print("Digite outro número:");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + num2);
	}
}
