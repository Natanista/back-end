package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto mede os lados desse quadrado: ");
		double lados = scan.nextDouble();
		double area = lados * lados;
		System.out.println("Area do quadrado:" + area+"\nDobro da área:" + area*2 );
	}
}
