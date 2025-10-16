package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica09 {
	
	/**
	 
      		9. Escribir un programa que nos pida elegir entre cuatro destinos turísticos
      		(Francia, Italia, Chile o Japón) y dependiendo de nuestra respuesta nos diga cual
      		es la capital de nuestro destino.
     */
	

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que elija un destino turístico
        System.out.println(" Elige un destino turístico (Francia, Italia, Chile, Japón):");
        String destino = teclado.nextLine();

        // Convertimos a minúsculas para evitar problemas de mayúsculas
        destino = destino.toLowerCase();

        // Mostramos la capital según el destino
        switch (destino) {
            case "francia":
                System.out.println(" La capital de Francia es París.");
                break;
            case "italia":
                System.out.println(" La capital de Italia es Roma.");
                break;
            case "chile":
                System.out.println(" La capital de Chile es Santiago de Chile.");
                break;
            case "japón":
            case "japon": // por si el usuario no escribe tilde
                System.out.println(" La capital de Japón es Tokio.");
                break;
            default:
                System.out.println(" Destino no válido. Por favor, elige Francia, Italia, Chile o Japón.");
        }
        
System.out.println("*** Fin del programa ***");
        teclado.close();
    }

}
