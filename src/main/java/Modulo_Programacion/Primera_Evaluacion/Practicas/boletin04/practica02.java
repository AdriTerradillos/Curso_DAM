package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica02 {
	
	  /**
       2. En matemáticas, la sucesión de Fibonacci se trata de una serie infinita de números
       naturales. Los dos primeros son siempre el 0 y el 1. Los siguientes se obtienen
       sumando los dos anteriores. El tercero sería 1 (la suma de 0 + 1), el cuarto sería 2 (la
       suma de 1 + 1), el quinto 3 (la suma de 1 + 2) y así sucesivamente. La lista con los 10
       primeros números sería esta: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34].


       Queremos hacer un programa que reciba un número por teclado y nos calcule tantos
       números de la sucesión de fibonacci como indique ese número. Por ejemplo, si
       metemos un 8 la salida de tu programa debería de ser así:
       0,1,1,2,3,5,8,13

       2. Generar los primeros n números de la sucesión de Fibonacci
      		Ejemplo: los 10 primeros → [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
      		
     */

	 public static void main(String[] args) {

         // Voy a pedir al usuario cuántos números de Fibonacci quiere ver
         Scanner teclado = new Scanner(System.in);

         System.out.println("Introduce el número de elementos de la sucesión de Fibonacci:");
         int n = teclado.nextInt();

         if (n <= 0) {
             System.out.println("El número debe ser mayor que 0.");
         } else {
             // Inicializo los dos primeros números de Fibonacci
             int a = 0, b = 1;
             int contador = 1;

             // Genero la sucesión sumando los dos anteriores
             while (contador <= n) {
                 System.out.print(a);
                 if (contador < n) {
                     System.out.print(",");
                 }
                 int siguiente = a + b;
                 a = b;
                 b = siguiente;
                 contador++;
             }
             System.out.println();
         }

         teclado.close();

	    }
	
}
