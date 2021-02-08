package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Digite o raio do circulo: ");
	double raio = scan.nextDouble();
	double area = 3.14 * (2 * raio); 
	System.out.println("A área do circulo equivale a: " + area );

	}

}
