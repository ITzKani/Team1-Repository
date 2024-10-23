class Ejercicio10{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};//arreglo del 1 al 10
        System.out.println(arreglo(a));//imprimos el arreglo
    }
    public static int arreglo(int[] z){//metodo estatico con variable tipo entero
        int i;//declaramos otra variable
        for (i = 0; i <=z.length -1; i++) {//ciclo for para imprimir en descendencia
            System.out.println(z[i]);//imprimos la descendencia
            
        }
        return z[i];//devuelve el ciclo del arrleglo "a"
    }

}