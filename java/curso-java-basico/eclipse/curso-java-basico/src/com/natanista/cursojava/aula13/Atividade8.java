package com.natanista.cursojava.aula13;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Quanto você ganha por hora?: ");
		double salarioHora = scan.nextDouble();
		System.out.print("Digite o número de horas trabalhadas: ");
		double hrsTrabalhadas = scan.nextDouble();
		double salarioTotal = salarioHora * hrsTrabalhadas;
		System.out.println("Seu sálario mensal é de: " + salarioTotal);
		
		

	}

}
