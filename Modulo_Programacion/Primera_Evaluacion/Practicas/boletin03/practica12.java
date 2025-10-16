package Primera_Evaluacion.Practicas.boletin03;

import java.util.Scanner;

public class practica12 {

	  /**
	   
      		12. Validar matrículas españolas: 4 dígitos + 3 letras mayúsculas
      		(excluyendo vocales, Ñ y Q)
      		
     */

	
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una matrícula:");
        String matricula = teclado.nextLine();

        
        // Patrón regex:
        // ^       -> inicio de la cadena
        // \\d{4}  -> cuatro dígitos
        // [B-DF-HJ-NP-TV-Z]{3} -> tres letras permitidas (sin vocales, Ñ, Q)
        // $       -> fin de la cadena
        
        String patron = "^\\d{4}[B-DF-HJ-NP-TV-Z]{3}$";

        if (matricula.matches(patron)) {
            System.out.println("La matrícula es válida.");
        } else {
            System.out.println("La matrícula NO es válida.");
        }

        teclado.close();
    }
}
