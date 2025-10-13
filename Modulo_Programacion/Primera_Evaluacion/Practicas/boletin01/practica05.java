package Primera_Evaluacion.Practicas.boletin01;


import java.util.Scanner;

public class practica05 {

    // Ejercicio 5 -> Escribir un programa que pida por teclado un número al usuario y 
    // diga si es par o impar

    /**
     1º- Pedir al usuario introducir un número por teclado (Scanner)
     2º- Condicional if, compruebo si el número es divisible entre 2 usando operando %
     3º- Si el resto es 0, mostrará par; distinto a 0, impar
     */

     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");

        } else {
            System.out.println("El número es impar");
        }

teclado.close();

System.out.println("");
System.out.println(" *** Fin del Programa ***");
System.out.println("");

        }
        
     }
    