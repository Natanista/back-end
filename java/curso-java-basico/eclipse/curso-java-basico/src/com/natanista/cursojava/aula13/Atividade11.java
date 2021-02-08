package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro numero inteiro: ");
		int num2 = scan.nextInt();
		System.out.print("Digite um numero real:");
		double num3 = scan.nextDouble();
		double resposta1 = (num1 * 2) * (num2 / 2);
		double resposta2 = (num1 * 3) + num3;
		double resposta3 = Math.pow(num3, 3);
		System.out.println("resposta 1: " + resposta1);
		System.out.println("resposta 2: " + resposta2);
		System.out.println("resposta 3: " + resposta3);		
	}
}
