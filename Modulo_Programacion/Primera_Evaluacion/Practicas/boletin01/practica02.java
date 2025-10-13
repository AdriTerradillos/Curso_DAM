package Primera_Evaluacion.Practicas.boletin01;

public class practica02 {
    
    // Ejercicio 2 -> Escribir un programa donde muestre los 50 primeros números pares

    /**
     1º- Bucle for, conteo del 1 al 50
     2º-Por cada vuelta, calculo número par multiplicando el contador por 2
     */

     public static void main(String[] args) {
        
        for(int i = 1; i<=50; i++) {
            int par = i*2;

            System.out.println(par);
        }
        
        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");
     }
}