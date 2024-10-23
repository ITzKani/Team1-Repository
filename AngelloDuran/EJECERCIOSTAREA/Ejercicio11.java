class Ejercicio11{
    public static void main(String[] args) {
        String a[]={"BadfaceSara", "Oldmami","RipGang","Adan","DavidGuetta","Dillom","CamiloSeptimo","OPGY"};//arreglo tipo String
        System.out.println(arreglo(a));//imprimos el arreglo
    }
    public static String arreglo(String[] z){//metodo estatico con variable tipo entero
        int i;//declaramos otra variable
        for (i = 0; i <=z.length -1; i++) {//ciclo for para imprimir en descendencia
            System.out.println(z[i]);//imprimos la descendencia
            
        }
        return z[i];//devuelve el ciclo del arrleglo "a"
    }

}