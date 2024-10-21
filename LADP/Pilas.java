import java.util.Stack;
class Pilas{
    public static void main(String[] args) {
        Stack<Integer> pilap = new Stack<Integer>();//Abrimos por la pila par
        Stack<Integer> pilai = new Stack<Integer>();//Abrimos la segunda pila 
        for(int i = 0; i<=30; i++){//Un for del cero al 30
            if(i%2==0){//La condicion if del numero par
            pilap.push(i);//Agregamos a la pilap
        }else{
            pilai.push(i);//agregamos a la pilai
        }
    }
        System.out.println(pilap);
        System.out.println(pilai);//Se hacen las impresiones
}
}