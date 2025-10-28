package pruebaExamen.Strings_00.ConditionalExercises;

import java.util.Scanner;

public class StringExercises7 {

    public static void main(String[] args) {


        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Introduzca el nombre del alumno: ");
        String nombreAlumno = teclado.nextLine();
        System.out.println(" Ingresa la nota del alumno " + nombreAlumno + " (0-100): ");

        double nota = teclado.nextDouble();

        if (nota < 5.00) {
            String suspenso = " El alumno ha suspendido";
            System.out.println(nombreAlumno + suspenso);
            System.out.println("Nota " + nombreAlumno + ":" + nota);


        } else if (nota >= 5.01 && nota <=7.99) {
            String aprobado = " El alumno ha aprobado";
            System.out.println(nombreAlumno + aprobado);
            System.out.println("Nota " + nombreAlumno + ":" + nota);

        } else if (nota >= 8.00 && nota <= 10.00) {
            String sobresaliente = " El alumno  a sacado un sobresaliente!";
            System.out.println(nombreAlumno + sobresaliente);
            System.out.println(" Nota " + nombreAlumno + ": " + nota);
        }
        teclado.close();
    }
}