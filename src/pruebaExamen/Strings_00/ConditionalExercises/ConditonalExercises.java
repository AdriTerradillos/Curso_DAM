package pruebaExamen.Strings_00.ConditionalExercises;

import java.util.Scanner;

public class ConditonalExercises {


    public static void main(String[] args) {




        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        Scanner teclado = new Scanner(System.in);

        System.out.println(" Introduzca su edad actual: ");
        byte age = 17;

        if (age >= 18) {
            System.out.println(" El usuario es mayor de edad. ¡Vota!");

        } else {
            System.out.println("El usuario es menor de edad. ¡No puede votar!");

        }
        System.out.println(" *** FIn ejercicio ***");

        System.out.println(" ");
        System.out.println(" ");

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        System.out.println(" Introduzca el primer valor numérico: ");
            byte firstValue = teclado.nextByte();

        System.out.println(" A continuación, tecleé el segundo valor: ");
        byte secondValue = teclado.nextByte();

        if (firstValue > secondValue && firstValue != 0) {
            System.out.println(" El número " + firstValue + " es mayor que el número " + secondValue + ".");
        } else if (secondValue > firstValue) {
            System.out.println(" El número " + secondValue + " es mayor que el número " + firstValue + ".");

        } else if (firstValue == secondValue) {
            System.out.println(" Ambos números son iguales..");
        }

        System.out.println(" *** Fin del Programa *** ");

        System.out.println(" ");
        System.out.println(" ");

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        if (firstValue > 0) {
            System.out.println(" El número " + firstValue + "es positivo. ");

        } else if (firstValue == 0) {
            System.out.println(" El número " + firstValue + " es igual a cero.");

        } else {
            System.out.println(" El numero " + firstValue + " es negativo.");
        }

        System.out.println(" *** Fin del Programa *** ");

        System.out.println(" ");
        System.out.println(" ");

        // 4. Crea un programa que diga si un número es par o impar.

        System.out.println(" Introduzca un número: ");
        byte num01 = teclado.nextByte();
        if (num01 % 2 == 0) {
            System.out.println(" El numero " + num01 + "es par. ");

        } else {
            System.out.println(" El número " + num01 + " es impar. ");
        }

        System.out.println(" *** Fin del Programa *** ");

        System.out.println(" ");
        System.out.println(" ");


        // 5. Verifica si un número está en el rango de 1 a 100.
        byte contador = 0;
        for (int i = 0; num01 >= 1 || num01 <= 100; i++) {
            contador++;
            System.out.println(num01);

        }

        System.out.println(" *** Fin del Programa *** ");

        System.out.println(" ");
        System.out.println(" ");


        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

// un switch es como una sucesión de if's anidados

        String dia = "Miércoles";
        byte diasSemana = 0;

        switch (diasSemana) {

            case 1:
                System.out.println("Es Lunes");
            case 2:
                System.out.println("Es Martes");
            case 3:
                System.out.println("Es Miércoles");
            case 4:
                System.out.println("Es Jueves");
            case 5:
                System.out.println("Es Viernes");
            case 6:
                System.out.println("Es Sábado");
            case 7:
                System.out.println("Es Domingo");

                System.out.println(" *** Fin ejercicio ***");

                System.out.println(" ");
                System.out.println(" ");

        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).







        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.


        teclado.close();
    }
}
