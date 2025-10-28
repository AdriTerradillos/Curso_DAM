package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin05;

import java.sql.Array;

public class practica01 {

    /*
            1. Escribir un programa que genere seis números aleatorios entre el 1 y el 49 sin que
            ninguno de ellos esté repetido (simulando una lotería primitiva).
     */

    public static void main(String[] args) {

        int[] primitiva = new int[6];
        int contador = 0;

        while (contador < 6) {

            // int aleatorio = (int)(Math.random()*(fin-inicio+1)+inicio);
            // si no he metido ya ese número
            int numero = (int) (Math.random() * 49 + 1); // esta variable solo existe entro del while, fuera no existe.

            boolean yaExiste = false; // genero variable booleana. fuera del bucle while, no existe esta variable

            for (int n = 0; n < 6; n++) {

                if (primitiva[n] == numero) {
                    yaExiste = true;

                    // si no he metido ya este número
                    if (yaExiste == false) {
                        primitiva[contador] = numero;
                        contador++;
                    }
                }
            }

                for (int n : primitiva) // mis resultados los guardo dentro de la variable n (anido los datos de 'primitiva')
                    System.out.println(n); // saco en pantalla los resultados dentro de n

                System.out.println(primitiva.length); // aquí, veo en pantalla la longitud de mi array 'Primitiva'


            }
        }
    }

