package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica06 {

	
	/**
     * 6. Escribir un programa que pida por teclado una cadena de texto y la separe en
     * dos distintas:
     * - Primera cadena: letras en posiciones pares
     * - Segunda cadena: letras en posiciones impares
     * Ejemplo: "Hola Mundo" → primera: "Hl ud", segunda: "oaMno"
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario la cadena de texto:
        
        System.out.println("Introduce una cadena de texto:");
        String texto = teclado.nextLine();

        // generamos las variables para separar caracteres:
        
        String cadenaPar = "";
        String cadenaImpar = "";

        // Recorremos la cadena con el bucle for:
        for (int i = 0; i < texto.length(); i++) {
        	
            if (i % 2 == 0) { // índice par
                cadenaPar += texto.charAt(i);
                
            } else {          // índice impar
                cadenaImpar += texto.charAt(i);
            }
            
        }

        // Mostramos resultados:
        
        System.out.println("Primera cadena (posiciones pares): " + cadenaPar);
        System.out.println("Segunda cadena (posiciones impares): " + cadenaImpar);

        teclado.close();
    }
}
