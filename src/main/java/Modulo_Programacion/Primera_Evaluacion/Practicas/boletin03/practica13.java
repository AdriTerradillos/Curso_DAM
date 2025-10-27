package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica13 {

	  /**
	   
     		13. Validar matrículas españolas considerando que entre los números y letras
      		podría haber un espacio o un guion.
      		
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una matrícula:");
        String matricula = teclado.nextLine();

        
        String patron = "^\\d{4}[\\s-]?[B-DF-HJ-NP-TV-Z]{3}$";

//        genero una orden específica de la variable patrón --> condicional if
        if (matricula.matches(patron)) {
            System.out.println("La matrícula es válida.");
        } else {
            System.out.println("La matrícula NO es válida.");
        }

        teclado.close();
    }
}
