package com.natanista.cursojava.aula24;

public class TesteContato {

    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.nome = "Natan";
        contato.email = "natan@natan.com";
        contato.numero = "11-9827-6384";

        System.out.println(String.format("Contato 1: %s", contato.nome));
    }
}
