package com.natanista.cursojava.aula15;

import java.util.Scanner;

public class Atividade23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o tipo de carne?\n-Filé Duplo\n-Alcatra\n-Picanha\nResposta: ");
        String tipo = scan.nextLine();

        System.out.print("Qual a quantidade(kg): ");
        Double kiloGramas = scan.nextDouble();
        Double precoKg = 0.0;
        Double totalBruto = 0.0;

        if(kiloGramas > 5){
        if(tipo.equalsIgnoreCase("alcatra")){
            precoKg = 6.8;
            totalBruto = kiloGramas * precoKg;

        }else if(tipo.equalsIgnoreCase("picanha")){
            precoKg = 7.8;
            totalBruto = kiloGramas * precoKg;

        }else if(tipo.equalsIgnoreCase("file duplo")){
            precoKg = 5.8;
            totalBruto = kiloGramas * precoKg;

        }

        }else{

            if(tipo.equalsIgnoreCase("alcatra")){
                precoKg = 5.9;
                totalBruto = kiloGramas * precoKg;

            }else if(tipo.equalsIgnoreCase("picanha")){
                precoKg = 6.9;
                totalBruto = kiloGramas * precoKg;

            }else if(tipo.equalsIgnoreCase("file duplo")){
                precoKg = 4.9;
                totalBruto = kiloGramas * precoKg;

            }
        }

        System.out.print("Pagamento com cartão tabajara?\n-(S)Sim\n-(N)Não\nResposta: ");
        String tipoPagamento = scan.next();
        Double desconto = 0.0;
        Double total = totalBruto;
        String meioDePagamento = "";

        if(tipoPagamento.equalsIgnoreCase("s")){
            desconto = totalBruto * 0.05;
            total -= desconto;
            meioDePagamento = "Cartão Tabajara";
        }else{
            meioDePagamento = "Outros";
        }

        String frase = String.format("Tipo da carne: %s" +
                "\nQuantidade: %.2f\npreço total: R$%.2f\nTipo de pagamento:%s" +
                "\nvalor do desconto: %.2f\nvalor a pagar: R$%.2f",tipo,kiloGramas,totalBruto,meioDePagamento,desconto,total);
        System.out.println(frase);



    }


}
