package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Integer proximo = 0;
        Integer primeiro = 1;
        Integer segundo = 1;

        System.out.println(primeiro);
        System.out.println(segundo);

        for(int i = 3; i < 500; i++){
        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
            if(segundo > 500){
                break;
            }
        System.out.println(proximo);

        }

    }
}
