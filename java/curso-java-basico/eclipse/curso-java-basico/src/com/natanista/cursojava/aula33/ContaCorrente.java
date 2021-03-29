package com.natanista.cursojava.aula33;

import java.util.concurrent.ThreadLocalRandom;

public class ContaCorrente {
    private String nome;
    private Integer numero = 0;
    private Integer agencia = 0;
    private Double saldo = 0.0;
    private Double limite = -400.0;
    private Boolean isSpecial = false;

    public ContaCorrente() {
        this.nome = nome;
        this.numero = gerarRandom();
        this.agencia = gerarRandom();
        this.saldo = 0.0;
    }

    private Integer gerarRandom(){
        Integer numeroRandom = ThreadLocalRandom.current().nextInt(1,999);
        return numeroRandom;
    }

    public ContaCorrente(String nome) {
        this.nome = nome;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        if(this.saldo - valor <= this.limite){
            this.saldo -= valor;
        }else{
            System.out.println("Você não tem grana amigo.");
        }
    }

    public void getNome() {
        System.out.println("Nome" + this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getNumero() {
        System.out.println("Numero:" + this.numero);
    }

    public void getAgencia() {
        System.out.println("Agência: " + this.agencia);
    }

    public void  getSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    public void getLimite() {
        System.out.println("Limite: " + this.limite);
    }

    public void getSpecial() {
        if(this.saldo > 100){
            this.isSpecial = true;
            System.out.println("A conta é especial");
        }
    }
}
