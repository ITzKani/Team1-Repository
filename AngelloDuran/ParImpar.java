import java.util.Stack;
class ParImpar{
    public static void main(String[] args) {
        //Metodo Main 
        Stack<Integer> pilapar = new Stack<Integer>();
        //Metodo Stack con variable Integer "pilapar"
        Stack<Integer> pilaimpar = new Stack<Integer>();
        //Metodo Stack con variable Integer "pilaimpar"
        for(int numero=1; numero<=30; numero++){
            //ciclo del 1 al 30
            if(numero%2==0){
            //incremento que va ser de 2 en 2
                pilapar.push(numero);
                //Almacena los datos "pilapar" -
            }else{
                pilaimpar.push(numero);
                //Almacena los datos "pilaimpar"
            }
        }
        System.out.println(pilapar);
        //Imprimimos valores de "pilapar"
        System.out.println(pilaimpar);
        //Imprimimos valores "pilaimpar"
    }
}