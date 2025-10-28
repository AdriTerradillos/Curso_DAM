package pruebaExamen.Strings_00.ConditionalExercises;

import java.util.Scanner;


public class ConditionalExercises8 {

    public static void main(String[] args) {

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un único carácter (a-z / A-Z): ");
        char caracter = teclado.next().charAt(0);


        if (caracter == 'a'||
        (caracter == 'e'||
        caracter == 'i'||
        caracter == 'o'||
        caracter == 'u' ||
        caracter == 'A' ||
        caracter == 'E' ||
        caracter == 'I' ||
        caracter == 'O' ||
        caracter == 'U'))
        {
            System.out.println("EL carácter " + caracter + " es una vocal.");


        } else if (Character.isLetter(caracter)) {
            System.out.println("El carácter" + caracter + " es una consonante.");
            System.out.println("El carácter introducido no cumple con la norma.");

        }
        else {
            System.out.println("El carácter introducido no cumple con la norma.");
        }




teclado.close();




// Matches es una buena opc



    }
}
