package com.natanista.cursojava.aula13;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora? :");
		double ganhoHora = scan.nextDouble();
		System.out.print("Quantas horas você trabalha no mês?: ");
		double horasTrabalhadas = scan.nextDouble();
		double salarioTotal = ganhoHora * horasTrabalhadas;
		double descontoIR = salarioTotal * 0.11;
		double descontoINSS = salarioTotal * 0.08;
		double descontoSindicato =  salarioTotal * 0.05;
		double salarioLiquido = 
			salarioTotal - descontoINSS - descontoIR - descontoSindicato;
		System.out.println("Salário Bruto: " + salarioTotal);
		System.out.println("Você pagou R$" + descontoINSS + " ao INSS");
		System.out.println("Você pagou R$" + descontoSindicato + " ao sindicato");
		System.out.println("Salário Líquido: " + salarioLiquido);
	

	}

}
