package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica08 {

	  /**
	   
      		8. Escribir un programa que reciba una cadena de texto por teclado y la muestre
      		sin vocales.
  
     */
	

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos la cadena de texto al usuario
        System.out.println("Introduce una cadena de texto:");
        String texto = teclado.nextLine();

        // generamos la variable para almacenar la cadena sin vocales
        String textoSinVocales = "";

        // Recorremos la cadena y eliminamos vocales --> bucle for + anidación if
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != 'a' && c != 'A' &&
            	c != 'á' && c != 'Á' &&
                c != 'e' && c != 'E' &&
                c != 'é' && c != 'É' &&
                c != 'i' && c != 'I' &&
                c != 'í' && c != 'Í' &&
                c != 'o' && c != 'O' &&
                c != 'ó' && c != 'Ó' &&
                c != 'u' && c != 'U' &&
            	c != 'u' && c != 'Ú') 
            {
                textoSinVocales += c;
            }
        }

        // Mostramos el resultado
        System.out.println("Texto sin vocales: " + textoSinVocales);

        teclado.close();
    }
}

