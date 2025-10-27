package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica06 {

    /*

        6. Modifica el ejercicio anterior para que la nota del boletín se redondee
        matemáticamente si es superior a 5 pero se trunquen los decimales si es inferior a 5

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // 1. Pido las tres notas
        System.out.print("Introduce la nota del trabajo en clase (0-10): ");
        double trabajo = teclado.nextDouble();

        System.out.print("Introduce la nota de los ejercicios prácticos (0-10): ");
        double practicos = teclado.nextDouble();

        System.out.print("Introduce la nota del examen (0-10): ");
        double examen = teclado.nextDouble();

        // 2. Calculo la media ponderada
        double notaFinal = (trabajo * 0.05) + (practicos * 0.15) + (examen * 0.80);

        // 3️⃣ Mostramos la nota real (dos decimales)
        System.out.printf("Nota real: %.2f%n", notaFinal);

        // 4️⃣ Aplicamos la regla del boletín
        int notaBoletin;
        if (notaFinal >= 5) {
            notaBoletin = (int) Math.round(notaFinal); // redondeo normal
        } else {
            notaBoletin = (int) notaFinal; // truncar
        }

        System.out.println("Nota de boletín: " + notaBoletin);

        teclado.close();
    }
}
