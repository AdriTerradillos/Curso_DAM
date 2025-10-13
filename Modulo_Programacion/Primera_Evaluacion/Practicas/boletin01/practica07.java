package Primera_Evaluacion.Practicas.boletin01;

import java.util.Scanner;



public class practica07 {

    // Ejercicio 7 -> Escribirun programa que pida un número por teclado que simule ser el
    // precio de un artículo y aplicarle el IVA del 21%

    /**
    1º- Pedir entrada por mensaje del precio del articulo al usuario (Scanner)
    2º- Calculo del IVA multiplicando precio original para obtener precio final

     */

     public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el precio del artículo: ");
        double precio = teclado.nextDouble();

        double precioFinal = precio * 1.21;
        System.out.println("El precio con IVA del 21% de este artículo es: " + precioFinal);


        teclado.close();

        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");




        }
      }
     
    