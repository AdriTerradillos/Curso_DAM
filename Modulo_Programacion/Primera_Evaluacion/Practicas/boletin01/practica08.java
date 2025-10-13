package Primera_Evaluacion.Practicas.boletin01;


import java.util.Scanner;

public class practica08 {
    

    // Ejercicio 8 -> Escribir un programa que reciba el importe de una cantidad a pagar y número de 
    // meses, y devuelva el pago mensual


    /**
     1º- Entrada mensaje del usuario: importe total y el número de meses (Scanner)
     2º- Dividir importe entre numero Meses para obtener pago mensual
     3º- Redondeo del resultado a dos decimales (String.format)

      */
      
      
        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce el importe total en euros: ");
            double importe = teclado.nextDouble();

            System.out.println("Introduce el número de meses: ");
            int meses = teclado.nextInt();

            double pagoMensual = importe / meses;
            System.out.println("El ago mensual sera: %.2f euros%n " + pagoMensual);


            teclado.close();

        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");


        }
        
}