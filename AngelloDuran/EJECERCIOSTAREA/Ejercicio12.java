class Ejercicio12{
    public static void main(String[] args) {
        char a[]={'a','b','c','d','e','f','g','h','i'};//arreglo tipo Character
        System.out.println(arreglo(a));//imprimos el arreglo
    }
    public static char  arreglo(char [] z){//metodo estatico con variable tipo entero
        int i;//declaramos otra variable
        for (i = 0; i <=z.length -1; i++) {//ciclo for para imprimir en descendencia
            System.out.println(z[i]);//imprimos la descendencia
            
        }
        return z[i];//devuelve el ciclo del arrleglo "a"
    }

}