package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin05;

public class arrays_ejercicioLibre {

    public static void main(String[] args) {

        String numero = "1234512345678967898990";
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
