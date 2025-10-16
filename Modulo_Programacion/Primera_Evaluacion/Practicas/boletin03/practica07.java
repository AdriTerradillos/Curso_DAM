package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica07 {

	 /**
     * 7. Escribir un programa que pida por teclado una cadena de texto y la escriba
     * con el alfabeto típico de los hackers sustituyendo:
     * a/A → 4
     * e/E → 3
     * i/I → 1
     * o/O → 0
     */

	
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos la cadena al usuario
        System.out.println("Introduce una cadena de texto:");
        String texto = teclado.nextLine();

        // generamos la variable para almacenar el texto “hackerizado”
        String textoHacker = "";

        // Recorremos la cadena y reemplazamos caracteres --> bucle for
        for (int i = 0; i < texto.length(); i++) {
        	
//        	generamos variable temporal -> contar texto caracter a caracter
            char c = texto.charAt(i);

            switch (c) {
                case 'a': case 'A':
                    textoHacker += "4";
                    break;
                case 'e': case 'E':
                    textoHacker += "3";
                    break;
                case 'i': case 'I':
                    textoHacker += "1";
                    break;
                case 'o': case 'O':
                    textoHacker += "0";
                    break;
                default:
                    textoHacker += c; // demás caracteres se mantienen
            }
        }

        // Mostramos el resultado
        System.out.println("Texto en lenguaje hacker: " + textoHacker);

        teclado.close();
    }
}
