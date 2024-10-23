import java.util.Scanner;
    class Ejercicio3{
        public static void main(String[] args) {
            Scanner multi = new Scanner(System.in);//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa un numero: ");//pedimos al usuario un numero
            int a = multi.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa el siguiente numero: ");//pedimos al usuario el segundo numero
            int b = multi.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "*" + b + "=" + multiplicacion(a, b));//imprime la multiplicacion del usuario

        }
    public static int multiplicacion(int a,int b){//metodo estatico que recibe dos numeros tipo enteros
    return a * b;//devuelve la multiplicaciono de las variables tipo enteras
    }
}