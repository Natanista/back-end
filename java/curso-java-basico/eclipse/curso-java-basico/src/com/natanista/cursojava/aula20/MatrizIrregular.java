package com.natanista.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        Integer numeroEntrevistados = scan.nextInt();

        String[][] nomeFilhos = new String[numeroEntrevistados][];

        for (int i = 0; i < nomeFilhos.length; i++){

            System.out.println("Entre com a quantidade de filhos: ");
            Integer quantidadeFilhos = scan.nextInt();
            nomeFilhos[i] = new String[quantidadeFilhos];

            for(int j = 0; j < nomeFilhos[i].length; j++){
                System.out.println("Digite o nome do filho: " + (j + i));
                nomeFilhos[i][j] = scan.next();
            }

        }

        for (int i = 0; i < nomeFilhos.length; i++){
            System.out.println("Pessoa " +  i + " tem " + nomeFilhos[i].length + " filhos");
            for(int j = 0; j < nomeFilhos[i].length; j++){
                System.out.println(nomeFilhos[i][j]);
            }
        }


    }
}
