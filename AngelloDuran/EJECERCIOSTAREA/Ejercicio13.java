import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int num = numero(); // Declarar una variable y asignarle el valor de la funcion 
        System.out.println(num + " es un numero mayor a 20 :)"); // Imprimir que el numero ingresado
    }
    public static int numero() { // Método estatico con variable entera
        try(Scanner num = new Scanner(System.in)){  // Crear objeto Scanner para leer la entrada 
        int numeros; // Declarar variable 
        do {
            System.out.print("Ingresa un número mayor a 20: "); // Pedir al usuario un numero > 20
            numeros = num.nextInt(); // Asignar el valor obtenido :)
            if (numeros <= 20) { // Validar si el numero es menor a 20
                System.out.println("Error. Inténtalo nuevamente"); // Imprime error
            }
        } while (numeros <= 20); // Vuelvea pedir el numero hasta que el numero sea > a 20
        return numeros; // Devuelv el numero
    }
}
}