package com.natanista.cursojava.aula33;

public class Lampada {
    private Boolean isOn;
    private Boolean isOff;
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligarLampada(){
        isOn = true;
        isOff = false;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligarLampada(){
        isOn = false;
        isOff = true;
        System.out.println("A lâmpada foi desligada.");
    }

    public void verificarLampada(){
        if(this.isOn = true){
            System.out.println("A lâmpada está ligada.");
        }else {
            System.out.println("A lâmpada está desligada.");
        }

    }
}
