import java.util.Stack;
    class Nombre{
    public static void main(String[] args){
        Stack <Character> pila = new Stack <Character>();//Metodo Stack declaramos variable tipo Character

    pila.push ('A');
    pila.push ('N');
    pila.push ('G');
    pila.push ('E');
    pila.push ('E');
    pila.push ('L');
    pila.push ('L');
    pila.push ('O');
    //Almacenamos letra por letra mi nombre
    System.out.println(pila.peek());//Imprimimos y borramos la ultima pila

    pila.push ('D');
    pila.push ('U');
    pila.push ('R');
    pila.push ('A');
    pila.push ('N');
    //Almacenamos mi primero apellido
    pila.pop();
    pila.pop();
    //Eliminimos dos pilas
    System.out.println(pila);
    //imprimimos la pila 

    pila.push ('E');
    pila.push ('S');
    pila.push ('P');
    pila.push ('I');
    pila.push ('N');
    pila.push ('O');
    //Almacenamos mi segundo apellido letra por letra
    for (Character name:pila){//bucle por 
        System.out.println(name);
    }

}
}