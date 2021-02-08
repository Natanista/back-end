package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digita a nota 1:");
		double nota1 = scan.nextDouble();
		System.out.print("Digita a nota 2:");
		double nota2 = scan.nextDouble();
		System.out.print("Digita a nota 3:");
		double nota3 = scan.nextDouble();
		System.out.print("Digita a nota 4:");
		double nota4 = scan.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média final:" + mediaFinal);

	}

}
