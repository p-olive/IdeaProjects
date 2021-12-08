package com.letscode.ex2.q1;

import java.util.Scanner;

public class Questão1 {
    public static void main(String[] args){

        Scanner numberScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float firstNumber = numberScanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        float secondNumber = numberScanner.nextFloat();

        final float sum = firstNumber + secondNumber;
        final float subtraction = firstNumber - secondNumber;
        final float multiplication = firstNumber * secondNumber;
        final float division = firstNumber / secondNumber;

        System.out.printf("A soma entre o primeiro e o segundo número é %.2f\n", sum);
        System.out.printf("A subtração entre o primeiro e o segundo número é %.2f\n", subtraction);
        System.out.printf("A multiplicação entre o primeiro e o segundo número é %.2f\n", multiplication);
        System.out.printf("A divisão entre o primeiro e o segundo número é %.2f\n", division);
    }
}
