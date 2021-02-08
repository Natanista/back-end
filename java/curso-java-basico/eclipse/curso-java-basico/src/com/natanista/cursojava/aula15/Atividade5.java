package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua media: ");
		
		double media = scan.nextDouble();
		
		if(media == 10) {
			System.out.println("Aprovado com honra");
		} else if(media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		} 
		
		

	}

}
