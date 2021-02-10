package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade20 {

	public static void main(String[] args) {
		
		int yes = 0;
		int no = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima?(sim-nao)");
		String resposta1 = scan.next();
		
		if(resposta1.equalsIgnoreCase("sim")) {
			yes++;
		}else {
			no++;
		}
		
		System.out.println("Esteve no local do crime(sim-nao)");
		String resposta2 = scan.next();
		
		if(resposta2.equalsIgnoreCase("sim")) {
			yes++;
		}else {
			no++;
		}
		
		System.out.println("Mora perto da vítima?(sim-nao)");
		String resposta3 = scan.next();
		
		if(resposta3.equalsIgnoreCase("sim")) {
			yes++;
		}else {
			no++;
		}
		
		System.out.println("Devia para a vítima?(sim-nao)");
		String resposta4 = scan.next();
		
		if(resposta4.equalsIgnoreCase("sim")) {
			yes++;
		}else {
			no++;
		}
		
		System.out.println("Já trabalhou com a vítima(sim-nao)");
		String resposta5 = scan.next();
		
		if(resposta5.equalsIgnoreCase("sim")) {
			yes++;
		}else {
			no++;
		}
		
		System.out.println("Sua classificação no crime: " + yes);
		
		if(yes == 2) {
			System.out.println("Suspeita!");
		}else if(yes >= 3 && yes <= 4 ) {
			System.out.println("Cumplice!");
		}else if(yes >= 5) {
			System.out.println("Assassino!");
		}else {
			System.out.println("Inocente!");
		}

	}

}
