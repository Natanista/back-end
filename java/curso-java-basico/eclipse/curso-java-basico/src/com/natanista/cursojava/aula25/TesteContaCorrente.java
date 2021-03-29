package com.natanista.cursojava.aula25;

public class TesteContaCorrente {

    public static void main(String[] args) {
    ContaCorrente conta1 = new ContaCorrente("Jonas",100.0,2,true, -500.0);
    conta1.depositar(500.0);
    conta1.isUsingSpecialCheck();
    conta1.sacar(100.0);
    conta1.sacar(200.0);
    conta1.getSaldo();
    conta1.sacar(400.0);
    conta1.isUsingSpecialCheck();
    }
}
