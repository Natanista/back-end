package com.natanista.cursojava.aula24;

public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Natan", 2000000.0,001,true,9999999.0);
        System.out.println(conta1.nome + ". É especial? : " + conta1.isSpecial);
    }
}
