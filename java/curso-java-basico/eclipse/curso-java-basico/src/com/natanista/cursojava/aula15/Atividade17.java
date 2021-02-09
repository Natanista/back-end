package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = scan.nextInt();
		
		if(ano % 4 == 0) {
			if(ano % 100 == 0) {
				if(ano % 400 == 0) {
					System.out.println("O ano é bissexto! Tem 366 dias!");
				}else {
					System.out.println("O ano não é bissexto!");
				}
			}else {
				System.out.println("O ano é bissexto! Tem 366 dias");
			}
			
		}else {
			System.out.println("O ano não é bissexto!");
		}
		
		
	}

}
