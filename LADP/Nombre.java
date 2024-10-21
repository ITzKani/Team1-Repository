import java.util.Stack;
class Nombre{
    public static void main(String[] args) {
        Stack<String> pila = new Stack<String>();//Creamos la pila 
        pila.push ("L");
        pila.push ("u");
        pila.push ("i");
        pila.push ("s");//Se ingresa el primer nombre
        System.out.println(pila.peek());//Usamos peek para mostrar el utlimo elemento de la pila
        pila.push("A");
        pila.push("l");
        pila.push("f");
        pila.push("r");
        pila.push("e");
        pila.push("d");
        pila.push("o");//Se ingresa el segundo nombre
        System.out.println(pila.search("A"));//Usamos search para buscar la primera vocal del nombre
        pila.push("D");
        pila.push("i");
        pila.push("A");
        pila.push("z");//Ingresamos el primer apellido
        pila.pop();
        pila.pop();//Usamos dos pop para eliminar dos valores de la pila
        System.out.println(pila);//Hacemos la impresion de la pila 
        pila.push("P");
        pila.push("a");
        pila.push("t");
        pila.push("r");
        pila.push("i");
        pila.push("i");
        pila.push("c");
        pila.push("o");//Ingresamos el segundo apellido 
        for(String name:pila){//Usamos for para iterar
            System.out.println(name);//Hacemos la impresion del for ahora con su respectivo nombre
        }

        
        
    }
}