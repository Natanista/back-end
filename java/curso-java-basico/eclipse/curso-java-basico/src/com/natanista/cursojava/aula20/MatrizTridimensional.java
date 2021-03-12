package com.natanista.cursojava.aula20;

public class MatrizTridimensional {


    public static void main(String[] args) {

        Integer[][][] matrizTridimensional = new Integer[3][3][3];
        Integer soma = 0;
        Integer somaPares = 0;
        Integer somaImpares= 0;
        for(int i = 0; i < matrizTridimensional.length; i++){
            for(int j = 0; j < matrizTridimensional[i].length;j++){
                for(int k = 0; k > matrizTridimensional[i][j].length;k++){
                    matrizTridimensional[i][j][k] = i + j + k;
                    soma += matrizTridimensional[i][j][k];

                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    }else{
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }

            }
        }
        System.out.println("Soma total: " + soma);
        System.out.println("A soma dos impares é de : " + somaImpares);
        System.out.println("Soma dos pares: " + somaPares);
    }
}
