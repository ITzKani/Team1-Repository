import java.util.Scanner;
    class Ejercicio6{
        public static void main(String[] args) {
            Scanner area = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa la altura del triangulo: ");//pedimos al usuario un numero
            double a = area.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa la base del triangulo: ");//pedimos al usuario el segundo numero
            double b = area.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "*" + b + "/2" + "=" + areatriangulo(a, b));//imprime el area del usuario
        }
    public static double areatriangulo(double  a,double  b){//metodo estatico que recibe dos numeros tipo double
    return a * b/2;//devuelve el area de las variables tipo double
    }
}