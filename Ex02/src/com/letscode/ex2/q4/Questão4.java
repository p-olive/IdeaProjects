package com.letscode.ex2.q4;

import java.util.Scanner;

public class Questão4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERSOR DE CÂMBIO\n");
        System.out.print("Qual é a cotação do Dólar: R$");
        float brlPerUsd = sc.nextFloat();
        System.out.print("Quantos Reais você gostaria de converter: R$");
        float brl = sc.nextFloat();

        final float USD = brl / brlPerUsd;

        System.out.printf("R$ %.2f = USD$ %.2f", brl, USD);
    }
}
