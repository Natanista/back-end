package com.natanista.cursojava.aula24;

public class TesteCarro {

    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numeroPassageiros = 10;
        van.capacidadeCombustivel = 100.0;
        van.consumoDeCombustivel = 0.2;


        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "Ducato";
        fusca.numeroPassageiros = 10;
        fusca.capacidadeCombustivel = 100.0;
        fusca.consumoDeCombustivel = 0.2;

    }
}
