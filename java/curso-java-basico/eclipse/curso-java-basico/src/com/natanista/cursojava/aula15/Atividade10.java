package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em que turno você estuda? "
				+ "(M - matutino, V-vespertino ou N -noturno):");
		String resposta = scan.next();
		
		if(resposta.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
		}else if(resposta.equalsIgnoreCase("v")) {
			System.out.println("Boa tarde!");
		}else if(resposta.equalsIgnoreCase("n")) {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Horário inválido!");
		}
		

	}

}
