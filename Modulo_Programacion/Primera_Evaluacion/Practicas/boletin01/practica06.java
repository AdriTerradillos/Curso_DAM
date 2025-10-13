package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;

public class practica06 {

    // Ejercicio 6 -> Escribir un programa que pida por teclado un número al usuario y diga si es
    // divisible por 3 o no

    /**
     1º- Entada del mensaje por el usuario (Scanner)
     2º- Condicional if para comprobar si el número es fivisible entre 3 con operador %
     3º- Resultado -> si resto es 0, mostrará que es divisible entre 3; difentente a 0, no 
     */
    
     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número ");
        int numero = teclado.nextInt();

        if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3");

        } else {
            System.out.println("El número no es divisible por 3");
        }
teclado.close();

System.out.println("");
System.out.println(" *** Fin del Programa ***");
System.out.println("");

        }
     }