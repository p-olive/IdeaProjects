package com.letscode.tempconvert;

public class TempConverter {

    public static void main(String[] args) {
        double tCelsius = 18d;
        final double tFahrenheit = (tCelsius * 1.8) + 32;
        final double tKelvin = tCelsius + 273.15;
        final double tReaumur = tCelsius * 0.8;
        final double tRankine = (tCelsius * 1.8) + 491;

        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.\n", tCelsius, tFahrenheit);
        System.out.printf("%.2f graus Celsius equivalem a %.2f Kelvin.\n", tCelsius, tKelvin);
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Reaumur.\n", tCelsius, tReaumur);
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Rankine.\n", tCelsius, tRankine);
    }
}
