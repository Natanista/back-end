package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado 1 do triangulo: ");
		double lado1 = scan.nextDouble();
		System.out.println("Digite o lado 2 do triangulo: ");
		double lado2 = scan.nextDouble();
		System.out.println("Digite o lado 3 do triangulo: ");
		double lado3 = scan.nextDouble();
		boolean triangulo = lado1 + lado2 > lado3 || lado2 + lado3 > lado1 
				|| lado1 + lado3 > lado2;
		if(triangulo){
			if(lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo Equilátero!");
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triângulo Isóceles");
			}else {
				System.out.println("Triângulo Escaleno");
			}
		}
		
		

	}

}
