package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String conceito = "";
		String resultado = "";
		
		if(media > 9 && media <= 10) {
			conceito = "A";
			resultado = "Aprovado";
		}else if(media > 7.5 && media <= 9) {
			conceito = "B";
			resultado = "Aprovado";
		}else if(media > 6 && media <= 7.5) {
			conceito = "C";
			resultado = "Aprovado";
		}else if(media > 4 && media <= 6) {
			conceito = "D";
			resultado = "Reprovado";
		}else if(media > 0 && media <= 4) {
			conceito = "E";
			resultado = "Reprovado";
		}
		
		System.out.println("Média: " + media + 
				"\nConceito: " + conceito + "\nResultado: " + resultado);
	}

}
