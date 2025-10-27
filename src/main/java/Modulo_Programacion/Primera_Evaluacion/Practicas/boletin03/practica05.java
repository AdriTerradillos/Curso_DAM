package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica05 {

	/**
     * 5. Escribir un programa que pida por teclado una cadena de texto y la imprima
     * escrita al revés (ejemplo: "Hola Mundo" → "odnuM aloH")
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario la cadena de texto
        System.out.println("Introduce una cadena de texto:");
        String texto = teclado.nextLine();

        // String -> la variable almacena el texto invertido
        String textoInvertido = "";

        // Recorremos la cadena de atrás hacia adelante
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        teclado.close();

        // Mostramos el resultado
        System.out.println("Texto invertido: " + textoInvertido);

    }
}
	
