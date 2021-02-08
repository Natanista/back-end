package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num3 = scan.nextDouble();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("O primeiro número digitado é o maior");
		} else if(num2 >= num1 && num2 >= num3) {
			System.out.println("O segundo valor digitado é o maior");
		}else if(num3 >= num2 && num3 >= num1) {
			System.out.println("O terceiro valor digitado é o maior");
		}
		
		if(num1 <= num2 && num1 <= num3) {
			System.out.println("O primeiro número digitado é o menor");
		} else if(num2 <= num1 && num2 <= num3) {
			System.out.println("O segundo valor digitado é o menor");
		}else if(num3 <= num2 && num3 <= num1) {
			System.out.println("O terceiro valor digitado é o menor");
		}
		

	}

}
