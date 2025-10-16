package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica02 {

    /**
     * 2. Modifica el programa anterior para que cuando coincidan ambas contraseñas nos
     * informe del número de intentos inválidos
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String password, copyPassword;
        int intentosInvalidos = 0; // Contador de intentos fallidos

        do {
            System.out.println("Escribe tu contraseña: ");
            password = teclado.nextLine();

            System.out.println("Escribe nuevamente tu contraseña: ");
            copyPassword = teclado.nextLine();

            if (!password.equals(copyPassword)) {
                intentosInvalidos++; // Aumenta el contador si falla
                System.out.println("La contraseña es incorrecta. Inténtelo de nuevo.");
            }

        } while (!password.equals(copyPassword));

        System.out.println("La contraseña es correcta. ¡Felicidades!");
        System.out.println("Número de intentos inválidos: " + intentosInvalidos);
        System.out.println("*** Fin del Programa ***");

        teclado.close();
    }
}
