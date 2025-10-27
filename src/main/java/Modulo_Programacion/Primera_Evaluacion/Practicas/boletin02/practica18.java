package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica18 {

    /*
       18. La tabla de tarifas impositivas en España para 2022 es la siguiente:
       Escribe un programa que le pida al usuario su sueldo anual (lógicamente puede ser
        un número con decimales) y le informe que porcentaje de retención le corresponde, el
        importe de la misma y el importe neto restante que cobrará.
     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu sueldo anual:");
        double sueldo = teclado.nextDouble();

        double porcentaje = 0;

        // Tabla de retenciones simplificada (2022)
        if (sueldo <= 12450) {
            porcentaje = 19;
        } else if (sueldo <= 20200) {
            porcentaje = 24;
        } else if (sueldo <= 35200) {
            porcentaje = 30;
        } else if (sueldo <= 60000) {
            porcentaje = 37;
        } else if (sueldo <= 300000) {
            porcentaje = 45;
        } else {
            porcentaje = 47;
        }

        double retencion = sueldo * porcentaje / 100;
        double neto = sueldo - retencion;

        System.out.printf("Porcentaje de retención: %.2f%%%n", porcentaje);
        System.out.printf("Importe de retención: %.2f%n", retencion);
        System.out.printf("Sueldo neto: %.2f%n", neto);

        teclado.close();

    }
}
