package Primera_Evaluacion.Practicas.boletin04;

import java.util.Scanner;

public class practica02 {
	
	  /**
	   
      		2. Generar los primeros n números de la sucesión de Fibonacci
      		Ejemplo: los 10 primeros → [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
      		
     */

	 public static void main(String[] args) {

	        Scanner teclado = new Scanner(System.in);

	        System.out.println("Introduce cuántos números de Fibonacci quieres generar:");
	        int n = teclado.nextInt();

	        
	        if (n <= 0) {
	            System.out.println("Debe introducir un número mayor que 0.");
	            
	        } else {
	        	
	            // generamos para los dos primeros números
	            int a = 0;
	            int b = 1;

	            System.out.print("Sucesión de Fibonacci: ");

//	             anidamos bucle for
	            for (int i = 1; i <= n; i++) {
//	          mostramos el número actual
	                System.out.print(a); 

//	                 anidamos condicional if
	                if (i != n) {
	                    System.out.print(", "); 
	                }

	                int siguiente = a + b; // calculamos el siguiente número
	                a = b;                  // actualizamos los dos anteriores
	                b = siguiente;
	            }

	            System.out.println(); 
	        }

	        teclado.close();
	    }
	
}
