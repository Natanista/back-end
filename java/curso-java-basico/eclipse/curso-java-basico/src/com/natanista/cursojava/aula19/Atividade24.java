package com.natanista.cursojava.aula19;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Atividade24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] vetorA = new Integer[10];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.println(String.format("Digite o valor da posição %d: ", i));
            vetorA[i] = scan.nextInt();
        }
        Boolean palindromo = true;
        for(int i = 0; i < (vetorA.length / 2); i++){

            if(vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }


        System.out.println("Vetor A = ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println("");

        if (palindromo){
            System.out.println("é palindromo");
        }else{
            System.out.println("não é palindromo");
        }

    }
}
