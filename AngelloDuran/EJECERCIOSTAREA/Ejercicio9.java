import java.util.Scanner;
    class Ejercicio9{
        public static void main(String[] args) {
            try (Scanner hexagono = new Scanner(System.in)) {//metodo scanner que guarda los valores ingresados por el usuario
            System.out.println("ingresa el perimetro: ");//pedimos al usuario un numero
            int a = hexagono.nextInt();//guarda el primer valor que ingresa el usuario
            System.out.println("ingresa el opotemo: ");//pedimos al usuario el segundo numero
            int b = hexagono.nextInt();//guarda el segundo valor del usuario
            System.out.println(+a + "*" + b + "/2" + "=" + areahexagono(a, b));//imprime la division del usuario
        }
    }
    public static double areahexagono(double  a,double  b){//metodo estatico que recibe dos numeros tipo double
    return a * b/2;//devuelve el area de las variables tipo double
    }
}