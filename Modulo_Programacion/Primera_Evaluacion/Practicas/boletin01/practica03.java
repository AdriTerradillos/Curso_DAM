package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica03 {

    // Ejercicio 3 -> Escribir un programa que muestre los 5 primeros números múltiplos dado
    // por el usuario

    /**
     1º. Pedir a usuario introducir número por teclado (Scanner)
     2º. Bucle for, repita un total de 5 veces
     3º. Multiplicar el número introducido para obtener bucles
     
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduce un número ");
        int num = teclado.nextInt();

        for(int i = 1; i <= 5; i++) {
            System.out.println(num * i);
        }

        
        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");

        teclado.close();
    }
    
}