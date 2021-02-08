package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int valorA = scan.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int valorB = scan.nextInt();
		
		System.out.print("Digite o valor de c: ");
		int valorC = scan.nextInt();
		
		int valorDelta = 0;
		
		if(valorA == 0) {
			System.out.println("Equação do segundo grau não pode ter a igual a 0!");
		}else {
			valorDelta = (valorB * valorB) - 4 * valorA * valorC;
			if(valorDelta < 0) {
				System.out.println("A equação não possui raizes!");
			}else if(valorDelta == 0) {
				System.out.println("A equação possui apenas uma raiz!");
			}else if(valorDelta > 0) {
				System.out.println("A equação possui duas raizes!");
			}
		}
		
		
		
	}
}
