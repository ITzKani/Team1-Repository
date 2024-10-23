import java.util.Scanner;
    class Ejercicio8{
        public static void main(String[] args) {
            Scanner area = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("la altura del triangulo es 23: ");//pedimos al usuario un numero
            double a = 23;//le asignamos el valor del la alutra
            System.out.println("ingresa la base del triangulo: ");//pedimos al usuario el segundo numero
            double b = area.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "*" + b + "/2" + "=" + areatriangulo(a, b));//imprime la division del usuario
        }
    public static double areatriangulo(double  a,double  b){//metodo estatico que recibe dos numeros tipo double
    return a * b/2;//devuelve el area de las variables tipo double
    }
}