package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class practica03 {

    /**

            3. Escribir un programa que pida un número por teclado al usuario que simule ser el
            precio de un artículo y escriba el resultado de aplicarle el IVA del 21%. El resultado
            debe de estar redondeado a dos decimales.

     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();

        // Calculo el IVA del 21%
        double Iva = precio * 0.21;
        double precioConIva = precio + Iva;

        // redondeo a 2 decimales
        DecimalFormat df = new DecimalFormat("#.00");
        String resultado = df.format(precioConIva);

        System.out.println("El precio con 21% IVA es: " + resultado + " €");

        teclado.close();








    }
}
