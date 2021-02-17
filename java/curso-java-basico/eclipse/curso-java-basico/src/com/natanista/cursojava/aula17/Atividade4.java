package com.natanista.cursojava.aula17;

public class Atividade4 {

    public static void main(String[] args) {

        Double populacaoA = 80000.0;
        Double populacaoB = 200000.0;
        Integer cont = 0;

        while(populacaoA <= populacaoB){
            populacaoA += (populacaoA/100) * 3;
            populacaoB += (populacaoB/100) * 1.5;
            cont++;
        }

        System.out.println("População A: " + populacaoA);
        System.out.println("População B: " + populacaoB);
        System.out.println("Quantidade anos: " + cont);
    }
}
