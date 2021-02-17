package com.natanista.cursojava.aula17;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Boolean infoValida = false;

        do{
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            if (nome.length() > 3){
                infoValida = true;
            }else{
                System.out.println("O nome precisa ter mais de 3 caracteres");
            }
        }while(!infoValida);

        infoValida = false;
            do{
                System.out.print("Idade: ");
                Integer idade = scan.nextInt();
                if(idade >= 0 && idade <= 150){
                    infoValida = true;
                }else{
                    System.out.println("Idade inválida!");
                }
            }while (!infoValida);

            infoValida = false;

            do{
                System.out.print("Salário: ");
                Double salario = scan.nextDouble();

                if(salario > 0){
                    infoValida = true;
                }else{
                    System.out.println("Digite um salário acima de 0.");
                }
            }while(!infoValida);

            infoValida = false;

        do{
            System.out.print("Sexo(f-m): ");
            String sexo = scan.next();

            if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                infoValida = true;
            }else{
                System.out.println("Digite um sexo válido! M ou F!");
            }
        }while(!infoValida);

        infoValida = false;

        do{
            System.out.print("Estado civil(s-c-v-d): ");
            String estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")|| estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else{
                System.out.println("Digite um estado civil válido!");
            }
        }while(!infoValida);








    }
}
