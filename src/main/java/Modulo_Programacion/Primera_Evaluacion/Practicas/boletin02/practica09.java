package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica09 {

    /*

        9. Escribir un programa que pida números entre el 1 y el 100 por teclado hasta que
        escribamos la palabra FIN (con mayúsculas). Si el usuario introduce una entrada
        inválida (números superiores a 100, otras cadenas de caracteres que no sean FIN, etc.)
        no se tendrá en cuenta pero se mostrará un mensaje de error y el programa seguirá
        su curso. Cuando terminamos (al introducir la palabra FIN, recuerda) mostraremos
        por pantalla el numero de entradas válidas que hemos hecho (sin contar esta última
        que sólo sirve para finalizar el programa)
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce un número entre 1 y 100 (0 para salir): ");
            numero = teclado.nextInt();

            if (numero == 0) { // salir del bucle
                continuar = false;
            } else if (numero >= 1 && numero <= 100) {
                contador++;
            } else {
                System.out.println("Número fuera de rango.");
            }
        }

        System.out.println("Has introducido " + contador + " números válidos.");

        teclado.close();
    }
}
