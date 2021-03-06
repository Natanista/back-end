package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] idades = new Integer[10];
        Integer qtdPessoasSuperiorA35 = 0;

        for (int i = 0; i < idades.length; i++){
            System.out.println(String.format("Digite o valor da posição %d: ",i));
            idades[i] = scan.nextInt();
            if(idades[i] > 35){
                qtdPessoasSuperiorA35++;
            }
        }

        System.out.println(String.format("Quantidade de pessoas acima de 35 anos: %d",qtdPessoasSuperiorA35));
    }
}
