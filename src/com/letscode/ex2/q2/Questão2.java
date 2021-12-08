package com.letscode.ex2.q2;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args){

        Scanner intScanner = new Scanner(System.in);
        System.out.print("Digite um inteiro de 1 a 10: ");
        int integer = intScanner.nextInt();

        while (integer<1 || integer>10){
            System.out.println("Erro: Número inválido!");
            System.out.print("Digite um inteiro de 1 a 10: ");
            integer = intScanner.nextInt();
        }

        System.out.printf("\n\nTABUADA DO %d\n\n", integer);

        for (int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n", integer, i, (integer*i));
        }
    }
}
