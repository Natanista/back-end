package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantas hrs vc trabalha por mês?: ");
		double horasTrabalhadas = scan.nextDouble();
		
		System.out.print("Qual o valor vc ganha por hora?: ");
		double valorHora = scan.nextDouble();
		
		double taxaIR = 0;
		double salarioBruto = valorHora * horasTrabalhadas;
		
		if(salarioBruto > 2500) {
			taxaIR = 0.2;
		}else if(salarioBruto <= 2500) {
			taxaIR = 0.1;
		}else if(salarioBruto <= 1500) {
			taxaIR = 0.05;
		}else if(salarioBruto <= 900) {
			taxaIR = 0;
		}
		
		
		double descontoINSS = salarioBruto * 0.1;
		double descontoIR = salarioBruto * taxaIR;
		double descontoSindicato = salarioBruto * 0.03;
		double descontoFGTS = salarioBruto * 0.11;
		double totalDescontos = descontoFGTS + descontoINSS + descontoIR + descontoSindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println(horasTrabalhadas +" * "+ valorHora + "= " + salarioBruto);
		System.out.println("(-) IR (5%) = R$" + descontoIR);
		System.out.println("(-) INSS (10%) = R$" + descontoINSS);
		System.out.println("(-) FGTS (11%) = R$" + descontoFGTS);
		System.out.println("Total de descontos = R$" + totalDescontos);
		System.out.println("Salário Líquido = R$" + salarioLiquido);

	}

}
