package com.natanista.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade");
		} else {
			System.out.println("É menor de idade");
		}
		
		System.out.println("Entre com o valor do produto:");
		double produto = scan.nextDouble();
		
		if(produto <= 10) {
			System.out.print("Produto barato!");
		}else if(produto > 10 && produto < 15) {
			System.out.print("Pedir desconto!");
		}else if(produto >= 15 && produto < 17) {
			System.out.print("Pesquisar mais");
		}else {
			System.out.print("Produto muito caro");
		}
		
		
	}

}
