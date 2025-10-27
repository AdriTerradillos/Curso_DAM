package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica17 {

    /*

        17. Escribir un programa que reciba por teclado una temperatura en cualquiera de las
        tres unidades básicas (Celcius, Farenheit o Kelvin) y la devuelva en las otras dos.
        Tu programa reconocerá la unidad que has usado al introducir la entrada por teclado
        porque irá acompañado de una letra que lo indique. Por ejemplo, 12C, 280.57K o
        98.6F
        Se admitirán decimales en la entrada, (como se ve en los ejemplos anteriores) y se
        devolverá el resultado con dos decimales

        Las formulas de conversión entre unidades son las siguientes:

            => Para convertir de ºC a ºF use la fórmula: ºF = ºC x 1.8 + 32.
            => Para convertir de ºF a ºC use la fórmula: ºC = (ºF-32) ÷ 1.8.
            => Para convertir de ºK a ºC use la fórmula: ºC = ºK – 273.15
            => Para convertir de ºC a ºK use la fórmula: ºK = ºC + 273.15.
            => Para convertir de ºF a ºK use la fórmula: ºK = 5/9 (ºF – 32) + 273.15.
            => Para convertir de ºK a ºF use la fórmula: ºF = 1.8(ºK – 273.15) + 32

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura con unidad (ej: 12C, 98.6F, 280.57K):");
        String entrada = teclado.nextLine();

        // Obtener la unidad (último carácter)
        char unidad = entrada.charAt(entrada.length() - 1);
        // Obtener el valor numérico (todo menos el último carácter)
        String valorStr = entrada.substring(0, entrada.length() - 1);
        double valor = Double.parseDouble(valorStr);

        double celsius = 0, fahrenheit = 0, kelvin = 0;

        if (unidad == 'C' || unidad == 'c') {
            celsius = valor;
            fahrenheit = celsius * 1.8 + 32;
            kelvin = celsius + 273.15;

        } else if (unidad == 'F' || unidad == 'f') {
            fahrenheit = valor;
            celsius = (fahrenheit - 32) / 1.8;
            kelvin = celsius + 273.15;

        } else if (unidad == 'K' || unidad == 'k') {
            kelvin = valor;
            celsius = kelvin - 273.15;
            fahrenheit = 1.8 * (kelvin - 273.15) + 32;

        } else {
            System.out.println("Unidad no reconocida. Usa C, F o K.");
            teclado.close();
            return;
        }

        System.out.printf("Celsius: %.2f C%n", celsius);
        System.out.printf("Fahrenheit: %.2f F%n", fahrenheit);
        System.out.printf("Kelvin: %.2f K%n", kelvin);

        teclado.close();

    }
}
