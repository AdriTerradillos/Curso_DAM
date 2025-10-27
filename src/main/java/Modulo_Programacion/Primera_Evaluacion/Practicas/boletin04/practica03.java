package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica03 {

    /*
    3. Queremos ahora hacer un programa que reciba un número por teclado y nos muestre
    en orden todos los números de la sucesión de fibonacci que sean menores o iguales
    al que has enviado como argumento. Por ejemplo, si metemos el número 4 nos
    debería de devolver esto:

        --> 0,1,1,2,3
     */

    public static void main(String[] args) {

        // Voy a pedir al usuario un número límite y mostrar Fibonacci hasta ese número
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int limite = teclado.nextInt();

        if (limite < 0) {
            System.out.println("El número debe ser mayor o igual a 0.");
        } else {
            // Inicializo los dos primeros números
            int a = 0, b = 1;
            while (a <= limite) {
                System.out.print(a);
                int siguiente = a + b;
                a = b;
                b = siguiente;
                if (a <= limite) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

        teclado.close();


    }
}
