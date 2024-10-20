import java.util.Stack;
public class par_inpar {
    public static void main (String[] args){
        Stack <Integer> pilapar= new Stack<Integer>();
        Stack <Integer> pilainpar= new Stack<Integer>();
        for(int i=0; i<=30; i++){

            if(i%2==0){
                pilapar.push(i);
            }else{
                pilainpar.push(i);}
            }
            System.out.println(pilapar);
            System.out.println(pilainpar);
        }

  }
