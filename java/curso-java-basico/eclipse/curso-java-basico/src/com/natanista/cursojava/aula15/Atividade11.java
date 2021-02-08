package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade11 {
		
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu salário: ");
		double salario = scan.nextDouble();
		double reajuste = 0;
		String percentual = "";
		
		if(salario <= 280) {
			percentual = "20%";
			reajuste = salario * 0.2;
		}else if(salario > 280 && salario <= 700) {
			percentual = "15%";
			reajuste = salario * 0.15;
		}else if(salario > 700 && salario <= 1500) {
			percentual = "10%";
			reajuste = salario * 0.1;
		}else {
			percentual = "5%";
			reajuste = salario * 0.05;
		}
		 
		System.out.println("Salario antes do reajuste: R$" + salario);
		System.out.println("Percentual aplicado: " + percentual);
		System.out.println("Valor do aumento: R$" + reajuste);
		System.out.println("Novo salário: R$" + (salario + reajuste));
		
		
		
	}
	
}
