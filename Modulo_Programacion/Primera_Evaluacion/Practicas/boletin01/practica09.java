package Primera_Evaluacion.Practicas.boletin01;

public class practica09 {

    // Ejercicio 9 -> Escribir un programa que genere un número aleatorio entre 0 y 50 y lo muestre

    /**
     1º- Math.random() para generar un número aleatorio
     2º- Multiplico resultado por 51 para que se situe entre 0 y 50 inclusive
     3º- Conversión a entero utilizando (int) 

     */

     public static void main(String[] args) {
        
        int aleatorio = (int) (Math.random()* 51);
        System.out.println("El número aleatorio entre 0 y 50 es:  " + aleatorio);


        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");

        
     }

    
}