package com.natanista.cursojava.aula24;

import java.security.cert.CertificateParsingException;

public class ContaCorrente {

    String nome;
    Double saldo;
    Integer numero;
    Boolean isSpecial;
    Double limite;

    public ContaCorrente(
            String nome, Double saldo, Integer numero,
            Boolean isSpecial, Double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
        this.isSpecial = isSpecial;
        this.limite = limite;
    }
}
