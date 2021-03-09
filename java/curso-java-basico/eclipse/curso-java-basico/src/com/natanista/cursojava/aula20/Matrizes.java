package com.natanista.cursojava.aula20;

public class Matrizes {

    public static void main(String[] args) {

        Double[][] notasAlunos = new Double[3][4];

        notasAlunos[0][0] = 10.0;
        notasAlunos[0][1] = 8.0;
        notasAlunos[0][2] = 10.0;
        notasAlunos[0][3] = 9.0;

        notasAlunos[1][0] = 10.0;
        notasAlunos[1][1] = 8.0;
        notasAlunos[1][2] = 10.0;
        notasAlunos[1][3] = 9.0;

        notasAlunos[2][0] = 10.0;
        notasAlunos[2][1] = 8.0;
        notasAlunos[2][2] = 10.0;
        notasAlunos[2][3] = 9.0;

        notasAlunos[1][3] = 8.0;
        Double soma = 0.0;
        for(int i = 0; i < notasAlunos.length;i++) {
           soma = 0.0;
            for (int j = 0; j <= notasAlunos.length; j++) {
                soma += notasAlunos[i][j];
            }
            System.out.println("Media do aluno: " + (soma/4));
        }
    }
}
