package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero1 = scan.nextInt();
		
		System.out.print("Digite outro número: ");
		int numero2 = scan.nextInt();
		
		System.out.print("Entre com a operação (+ * / -): ");
		String operacao = scan.next();
		
		int resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+" : resultado = numero1 + numero2;
		break;
		case "-" : resultado = numero1 - numero2;
		break;
		case "*" : resultado = numero1 * numero2;
		break;
		case "/" : resultado = numero1 / numero2;
		default : System.out.println("Operação inválida!"); valida = false;
		}
		
		if(valida) {
			System.out.println(resultado);
			if(resultado > 0) {
				System.out.println("Resultado positivo!");
			}else {
				System.out.println("Resultado negativo");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("Resultado par!");
			}else {
				System.out.println("Resultado ímpar!");
			}
			
			
		}
	}

}
