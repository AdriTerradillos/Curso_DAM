package Primera_Evaluacion.Practicas.boletin01;


public class practica04 {

    // Ejercicio 4 -> Escribir un programa donde muestre todos los números divisibles por
    // 7 menores a 10000
    
    /**
     1º- Bucle for, conteo desde el 1 al 9999
     2º- Condicional if, para cada número, compruebo si es divisible por 7 usando operador %.
     Resultado -> si es divisible, mostrará en pantalla
     */


     public static void main(String[] args) {
        
        for(int i = 1; i < 10000; i++) {

            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("");
        System.out.println(" *** Fin del Programa ***");
        System.out.println("");
     }

}