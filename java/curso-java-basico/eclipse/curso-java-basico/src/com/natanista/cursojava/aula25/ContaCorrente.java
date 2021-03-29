package com.natanista.cursojava.aula25;

public class ContaCorrente {
    private String nome;
    private Double saldo;
    private Integer numero;
    private Boolean isSpecial;
    private Double limite;

    public ContaCorrente(
            String nome, Double saldo, Integer numero,
            Boolean isSpecial, Double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.numero = numero;
        this.isSpecial = isSpecial;
        this.limite = limite;
    }

    public void sacar(Double valor){
        if(this.saldo - valor >= this.limite){
            this.saldo -= valor;
            System.out.println(String.format("Saldo de R$%.2f efetuado.",valor));
        }else{
            System.out.println("Cara, você não tem essa grana");
        }
    }

    public void depositar(Double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " efetuado com sucesso!");
    }

    public void getSaldo(){
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    public void isUsingSpecialCheck(){
        if(this.saldo < 0){
            System.out.println("Conta em cheque especial");
        }else{
            System.out.println("A conta está com saldo positivo");
        }
    }


}
