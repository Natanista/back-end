package com.natanista.cursojava.aula19;

import java.util.Scanner;

public class Atividade19 {

    public static String verificarSituacao(Double media){
        String situacao = "";
        if(media >= 7){
            situacao = "Aprovado";
        }else{
            situacao = "Reprovado";
        }

        return situacao;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double[] nota1 = new Double[10];
        Double[] nota2 = new Double[nota1.length];
        Double[] resultado = new Double[nota1.length];

        for(int i = 0; i < nota1.length; i++){
            System.out.println("Digite a nota 1: ");
            nota1[i] = scan.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2[i] = scan.nextDouble();

            resultado[i] = (nota1[i] + nota2[i]) / 2;

        }

        for(int i = 0; i < nota1.length; i++){
                String situacao = verificarSituacao(resultado[i]);

                System.out.println(String.format("Média do aluno %d: ",i));
                System.out.println(String.format("Situação: %s", situacao));

        }




    }
}
