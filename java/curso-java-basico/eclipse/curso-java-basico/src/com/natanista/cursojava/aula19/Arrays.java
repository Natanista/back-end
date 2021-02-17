package com.natanista.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

        Double[] dias = new Double[365];
        dias[0] = 33.8;
        dias[1] = 33.1;
        dias[2] = 33.2;
        dias[3] = 33.3;
        dias[4] = 33.4;
        dias[5] = 33.6;

        System.out.println("Temperatura dia 3: " + dias[2]);

        System.out.println("Tamanho do array: " + dias.length);

        for(int i= 0; i < dias.length; i++){
            System.out.println("temperatuas: " + dias[i]);
        }

        // passar pelos itens da array - mais comum
        for(Double temp : dias){
            System.out.println(temp);
        }


    }
}
