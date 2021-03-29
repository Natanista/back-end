package com.natanista.cursojava.aula33;

public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Natan");

        conta1.depositar(900.0);
        conta1.getAgencia();
        conta1.getLimite();
        conta1.getSpecial();
        conta1.getSaldo();
    }
}
