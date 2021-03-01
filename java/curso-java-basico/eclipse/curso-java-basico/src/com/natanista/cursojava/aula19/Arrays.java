package com.natanista.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        Double[] temperaturas = new Double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 35.3;
        temperaturas[2] = 34.3;
        temperaturas[3] = 33.3;
        temperaturas[4] = 32.3;

        for(int i = 0; i < 5; i++){
            System.out.println("Temperatura atual = " + temperaturas[i] + "º");
        }
        System.out.println("Tamanho total do array =  " + temperaturas.length);

        for(Double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
