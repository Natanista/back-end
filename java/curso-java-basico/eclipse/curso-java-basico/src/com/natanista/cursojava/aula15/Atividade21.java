package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantos litros de combustivel?: ");
		double litros = scan.nextDouble();
		
		System.out.println("Qual o tipo de combustivel?(G-gasolina, A-alcool): ");
		String tipoCombustivel = scan.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		double precoTotal = 0;
		double desconto = 0;
	
		
		if(tipoCombustivel.equalsIgnoreCase("a")) {
			precoTotal = litros * precoAlcool;
			if(litros <= 20) {
				desconto = precoTotal * 0.03;
				precoTotal = precoTotal - desconto;
			}else {
				desconto = precoTotal * 0.05;
				precoTotal = precoTotal - desconto;
			}
			
		}else if(tipoCombustivel.equalsIgnoreCase("g")) {
			precoTotal = litros * precoGasolina;
			if(litros <= 20) {
				desconto = precoTotal * 0.04;
				precoTotal = precoTotal - desconto;
			}else {
				desconto = precoTotal * 0.06;
				precoTotal = precoTotal - desconto;
			}
		}
		System.out.println("O valor total é de: " + precoTotal);
	}
	
	

}
