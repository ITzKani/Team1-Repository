import java.util.Scanner;
    class Ejercicio2{
        public static void main(String[] args) {
            Scanner restas = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa un numero: ");//pedimos al usuario un numero
            int a = restas.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa el siguiente numero: ");//pedimos al usuario el segundo numero
            int b = restas.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "-" + b + "=" + resta(a, b));//imprime la resta del usuario

        }
    public static int resta(int a,int b){//metodo estatico que recibe dos numeros tipo enteros
    return a - b;//devuelve la resta de las variables tipo enteras
    }
}