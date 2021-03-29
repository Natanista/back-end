package com.natanista.cursojava.aula25;

public class Lampada {

    public String nome;
    private String localizacao;
    private Boolean isOn;
    private Boolean isOff;


    public void ligarLampada(){
        isOn = true;
        isOff = false;
        System.out.println("A lampada foi ligada!");
    }

    public void desligarLampada(){
        isOn = false;
        isOff = true;
        System.out.println("A lampada foi desligada!");
    }
}
