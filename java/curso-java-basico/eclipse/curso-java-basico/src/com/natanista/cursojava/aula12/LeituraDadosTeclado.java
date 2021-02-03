package com.natanista.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome é: " + nomeCompleto);
		
		System.out.print("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Você tem: " + idade);
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é de: " + altura);
		
		
		System.out.println("Digite seu nome, se tem cachorro, quantidade de filhos e altura");
		String nome = scan.next();
		boolean temCao = scan.nextBoolean();
		int qtdFilhos = scan.nextInt();
		double altura2 = scan.nextDouble();
		System.out.println(nome + temCao + qtdFilhos + altura2);
		
		

	}

}
