package com.letscode.ex2.q5;

import java.util.Scanner;

public class Questão5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERSOR DE POLEGADAS PARA CENTÍMETROS\n");
        System.out.print("Digite um comprimento em polegadas: ");
        float dInches = sc.nextFloat();

        final float D_CENTIMETERS = dInches * 2.54f;

        System.out.printf("%.2f polegadas equivalem a %.2f centímetros.", dInches, D_CENTIMETERS);
    }
}
