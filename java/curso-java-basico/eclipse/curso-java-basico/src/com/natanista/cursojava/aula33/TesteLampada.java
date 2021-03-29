package com.natanista.cursojava.aula33;

public class TesteLampada {

    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();

        lampada1.setModelo("Luxmax");
        lampada1.ligarLampada();
        lampada1.verificarLampada();
    }
}
