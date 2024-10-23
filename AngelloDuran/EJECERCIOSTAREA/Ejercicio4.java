import java.util.Scanner;
    class Ejercicio4{
        public static void main(String[] args) {
            Scanner division = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa un numero: ");//pedimos al usuario un numero
            int a = division.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa el siguiente numero: ");//pedimos al usuario el segundo numero
            int b = division.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "/" + b + "=" + divisiones(a, b));//imprime la division del usuario
        }
    public static int divisiones(int a,int b){//metodo estatico que recibe dos numeros tipo enteros
    return a / b;//devuelve la division de las variables tipo enteras
    }
}