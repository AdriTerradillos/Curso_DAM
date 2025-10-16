package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica04 {

    /**
     * 4. Escribir un programa que pida por teclado una cadena de texto y la escriba sin
     * espacios en blanco (si los hubiera). Además, nos debe decir el número de espacios
     * que ha encontrado y suprimido.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimosal usuario que ingrese una cadena de texto
        System.out.println("Introduce una cadena de texto:");
        String texto = teclado.nextLine();

        // Contamos caracter a caracter la cadena recibida
        int contadorEspacios = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == ' ') {
                contadorEspacios++;
            }
        }

        // Eliminamos espacios de la cadena --> .replace
        String textoSinEspacios = texto.replace(" ", "");

        // Mostramos resultados
        System.out.println("Texto sin espacios: " + textoSinEspacios);
        System.out.println("Número de espacios eliminados: " + contadorEspacios);

        teclado.close();
    }
}