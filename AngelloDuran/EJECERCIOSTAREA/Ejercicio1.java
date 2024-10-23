import java.util.Scanner;
    class Ejercicio1{
        public static void main(String[] args) {
        
        Scanner suma = new Scanner(System.in);//Metodo Scanner para guardar valores que ingrese el usuario
        System.out.println("Ingresa un numero: ");//pedirle al usuario un numero para sumar
        int a = suma.nextInt();//guarda el valor ingresado para el usuario
        System.out.println("ingresa el siguiente numero: ");//pedimos al usuario su segundo numero-
        int b = suma.nextInt();//guarda el valor ingresado para el usuario
        int r = a+b;//variable que suma a + b 
        System.out.println("tu suma es: "+ r);//imprime la suma con "r"
        }
    }