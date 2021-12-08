package com.letscode.tempconvert;

public class TempConverter {

    public static void main(String[] args) {
        float tCelsius = 18f;
        final float T_FAHRENHEIT = (tCelsius * 1.8f) + 32;
        final float T_KELVIN = tCelsius + 273.15f;
        final float T_REAUMUR = tCelsius * 0.8f;
        final float T_RANKINE = (tCelsius * 1.8f) + 491;

        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.\n", tCelsius, T_FAHRENHEIT);
        System.out.printf("%.2f graus Celsius equivalem a %.2f Kelvin.\n", tCelsius, T_KELVIN);
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Reaumur.\n", tCelsius, T_REAUMUR);
        System.out.printf("%.2f graus Celsius equivalem a %.2f graus Rankine.\n", tCelsius, T_RANKINE);
    }
}
