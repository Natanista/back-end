package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de kg de morangos: ");
        Double kgsMorango = scan.nextDouble();

        System.out.print("Digite a quantidade de kg de maca: ");
        Double kgsMaca = scan.nextDouble();

        Double valorMorango = 2.5;
        Double kgsTotal = kgsMaca + kgsMorango;

        if(kgsMorango > 5 ){
            valorMorango = 2.2;
        }

        Double valorMaca = 1.8;

        if(kgsMaca > 5){
            valorMaca = 1.5;
        }

        Double precoTotal = (kgsMaca * valorMaca) + (kgsMorango * valorMorango);

        if(kgsTotal > 8 || precoTotal > 25){
            Double desconto = precoTotal * 0.1;
            precoTotal -= desconto;
        }

        String frase = String.format("Você deve pagar R$%.2f",precoTotal);
        System.out.println(frase);

    }

}
