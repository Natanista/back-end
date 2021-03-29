package com.natanista.cursojava.aula25;

import java.util.Scanner;

public class TesteAluno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.nome =  scan.next();

        System.out.println(String.format("Entre com a nota do %s", aluno.nome));

    }

}
