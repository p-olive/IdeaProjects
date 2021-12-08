package com.letscode.ex2.q3;

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("CONVERSOR DE CELSIUS PARA FARHRENHEIT\n");
        System.out.print("Digite a temperatura em graus Celsius: ");
        float tCelsius = sc.nextFloat();

        final float T_FAHRENHEIT = (tCelsius * 1.8f) + 32;

        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.", tCelsius, T_FAHRENHEIT);
    }
}
