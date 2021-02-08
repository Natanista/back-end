package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o sexo: ");
		String sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");
		} else if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		}else {
			System.out.println("Sexo inválido");
		}

	}

}
