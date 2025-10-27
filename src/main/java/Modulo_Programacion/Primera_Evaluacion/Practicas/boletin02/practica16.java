package Modulo_Programacion.Primera_Evaluacion.Practicas.boletin02;

import java.util.Scanner;

public class practica16 {

/*

        16. Escribe un programa que pida por teclado el radio de una circunferencia, admitiendo
        valores con decimales y calcule la longitud y el área de la circunferencia (redondeando
        a cinco decimales). Si no las recuerdas, las fórmulas son las siguientes:

        --> area = 3.14159 * radio2
        --> longitud = 2 * 3.14159 * radio

 */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el radio de la circunferencia:");
        double radio = teclado.nextDouble();

        if (radio < 0) {
            System.out.println("El radio no puede ser negativo.");
        } else {
            double area = 3.14159 * radio * radio;
            double longitud = 2 * 3.14159 * radio;

            System.out.printf("Área: %.5f%n", area);
            System.out.printf("Longitud: %.5f%n", longitud);
        }

        teclado.close();

        
    }
    }

