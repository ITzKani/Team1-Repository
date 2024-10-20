import java.util.Stack;
class Ejercicio_nombre{
    public static void main(String[] args){
         Stack <Character> pila = new Stack <Character>();

    pila.push ('M');
    pila.push ('o');
    pila.push ('i');
    pila.push ('s');
    pila.push ('e');
    pila.push ('s');
    System.out.println(pila.peek());

    pila.push ('R');
    pila.push ('a');
    pila.push ('m');
    pila.push ('i');
    pila.push ('r');
    pila.push ('e');
    pila.push ('z');
    pila.pop();
    pila.pop();
    System.out.println(pila);

    pila.push ('S');
    pila.push ('a');
    pila.push ('l');
    pila.push ('i');
    pila.push ('n');
    pila.push ('a');
    pila.push ('s');
    
    for (Character name:pila){
        System.out.println(name);
    }

}
}