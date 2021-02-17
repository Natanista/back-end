package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario = "";
        String senha = "";
        while(usuario.equalsIgnoreCase(senha)){
            System.out.print("Digite seu usuáro: ");
            usuario = scan.next();
            System.out.print("Digite sua senha: ");
            senha = scan.next();
        }
        System.out.println("Login efetuado com sucesso!");

    }

}
