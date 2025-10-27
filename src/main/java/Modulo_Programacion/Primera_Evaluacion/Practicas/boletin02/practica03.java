package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica03 {

    /**

            3. Escribir un programa que pida un número por teclado al usuario que simule ser el
            precio de un artículo y escriba el resultado de aplicarle el IVA del 21%. El resultado
            debe de estar redondeado a dos decimales.

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos el precio original del artículo
        System.out.print("Introduce el precio del artículo en euros: ");
        double precioBase = teclado.nextDouble();

        // Calculamos el precio con IVA del 21%
        double precioConIVA = precioBase * 1.21;

        // Mostramos el resultado redondeado a 2 decimales
        System.out.printf("El precio con IVA es: %.2f euros%n", precioConIVA);

        teclado.close();
    }
}
