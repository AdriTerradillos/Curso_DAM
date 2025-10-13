package Primera_Evaluacion.Practicas.boletin01;


public class practica11 {
	
	 // Ejercicio 11 -> Modificar el programa anterior para que tire dos dados de forma continuada hasta
    // que salgan iguales. También debe informar cuántas tiradas ha hecho.

    /**
     1º- Bucle while, no sé cuántas veces se repetirá
     2º- Genero ds números aleatorios entre 1 y 6 en cada tirada
     3º- Conteo del número de intentos de cada variable
     4º-Parar cuando los dos dados sean iguales y mostrar cuántas tiradas fueron necesarias.

     */
	
    
     public static void main(String[] args) {
        
        int dado1, dado2;
        int tiradas = 0;

        do { 
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            tiradas++;

            System.out.println("Tirada " + tiradas + " : " + dado1 + " y " + dado2);

            
        } while (dado1 != dado2);
        System.out.println("¡Dados iguales! Ha costado " + tiradas + " tiradas");
        
        
     }
	
	
}
