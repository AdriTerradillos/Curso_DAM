package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica08 {

/*
        8. Escribe un programa que sume por un lado las cifras pares y por otro las impares de
        un número y nos muestre ambos resultados. Por ejemplo, si el número en cuestión es
        el 128 nos debería e decir que la suma de las cifras pares es 9 y la de las impares 2
 */


    public static void main(String[] args) {

        // Voy a pedir un número y sumar sus cifras pares e impares por separado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        int n = teclado.nextInt();
        int numero = (n < 0) ? -n : n;

        int sumaPares = 0;
        int sumaImpares = 0;

        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) sumaPares += digito;
            else sumaImpares += digito;
            numero /= 10;
        }

        System.out.println("Suma de cifras pares: " + sumaPares);
        System.out.println("Suma de cifras impares: " + sumaImpares);

        teclado.close();
    }
}
