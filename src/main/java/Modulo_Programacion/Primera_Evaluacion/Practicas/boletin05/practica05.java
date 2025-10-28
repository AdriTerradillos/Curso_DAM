package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin05;

import java.util.Arrays;

public class practica05 {


    /*
            5. Escribe un programa que genere 100 números aleatorios comprendidos entre el 1 y
            50 (ambos inclusive) y, posteriormente, obtenga el mayor, el menor y el que mas veces
            se repite (y nos diga cuantas veces lo hace).
     */

    public static void main(String[] args) {

        int tabla[] = new int[100]; // genero el Array con 100 elementos
        int contador;

            for (int i = 0; i < 100; i++) {
            tabla[i] = (int) (Math.random() *50) +1;
                Arrays.sort(tabla); // con este método, ordenamos el array
                System.out.println("El menor es " + tabla[0] + " y el mayor " + tabla[tabla.length - 1]);

                System.out.println("###############");
                for (i = 0; i < 10; i++) {
                    if (tabla[i] == tabla[i + 1]) {
                        System.out.println("EL elemento " + tabla[i] + " está repetido con su contíguo. " );
                    }

                }
                }
            }
}





