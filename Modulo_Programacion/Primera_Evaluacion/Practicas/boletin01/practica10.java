package Primera_Evaluacion.Practicas.boletin01;

public class practica10 {

	// Ejercicio 10 -> Escribir un programa que genere dos números aleatorios entre 1y 6
    // (simulando dos dados)

    /**
     1º. Genero dos números aleatorios entre 1 y 6 usando Math.random()
     2º. Conversión de resultado a enteros

     */
 
     public static void main(String[] args) {
        
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;

        System.out.println("Tirada de los dos dados: " + dado1 + " y " + dado2);


        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");
     }
}


