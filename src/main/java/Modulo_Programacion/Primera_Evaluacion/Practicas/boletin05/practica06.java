package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin05;

public class practica06 {

    /*
            6. Escribe un programa que nos permita contar el número de veces que se repite cada
        cifra en un número. Por ejemplo, el número 885210003 tiene tres 0, un 1, un 2, un 5 y
        dos 8
     */
    public static void main(String[] args) {

        String numero = "885210003";
        int[] contador = new int[10]; // creando un array vacío con 10 posiciones

        // generamos el bucle for para recorrer mi Array posición por posición (10 posiciones)
        for (int n = 0; n < numero.length(); n++) {

            // genero una variable intermedia, 'innecesaria' pero ayuda a salir del paso
            String cifra = "" + numero.charAt(n);

            // convierto mi array de String a entero --> parseInt
            int posicion = Integer.parseInt(cifra);
            contador[posicion] += 1;

        }

        for (int n = 0; n < 10; n++) {

            System.out.println("La cifra " + n + " aparece " + contador[n] + " veces.");
        }
    }
}


