import java.util.Scanner;
    class Ejercicio5{
        public static void main(String[] args) {
            Scanner modulo = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa un numero: ");//pedimos al usuario un numero
            double a = modulo.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa el siguiente numero: ");//pedimos al usuario el segundo numero
            double b = modulo.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "%" + b + "=" + modulos(a, b));//imprime la modulacion del usuario
        }
    public static double  modulos(double  a,double  b){//metodo estatico que recibe dos numeros tipo double
    return a % b;//devuelve el modulo de las variables tipo double
    }
}