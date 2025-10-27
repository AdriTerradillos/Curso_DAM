package main.java.Modulo_Programacion.Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica15 {

/**
 		
 		15. Escribe un programa que reciba por teclado una fecha en el formato DD/MM/YYYY. El
		programa debe de comprobar si la fecha es correcta teniendo en cuenta:
		Qué el formato sea el correcto
		Que la fecha sea totalmente válida teniendo en cuenta incluso los años que son
		bisiestos (aquellos que son divisibles entre cuatro).

 */
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Introduce una fecha con esta estructura (DD/MM/YYYY): ");
		String fecha = teclado.nextLine();
		
		
		String[] partes = fecha.split("/");
		
		if (partes.length != 3) {
			System.out.println( " Formato incorrecto.");
			return;
			
		}
		try {
			int dia = Integer.parseInt(partes[0]);
			int mes = Integer.parseInt(partes[1]);
			int anio = Integer.parseInt(partes[2]);
			
			boolean isBisiesto = (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0));
			
			int[] diaPorMes = {31, (isBisiesto ? 29 :28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			
			if (mes < 1 || mes > 12) {
				System.out.println(" Mes inválido");
				
			} else if (dia < 1 || dia > diaPorMes[mes - 1]) {
				System.out.println("Día inválido.");
				
			} else {
				System.out.println(" La fecha es correcta.");
			}
			
			
		} catch (NumberFormatException e) {
			System.out.println(" Formato de número incorrecto");
		}
		
	}
}
