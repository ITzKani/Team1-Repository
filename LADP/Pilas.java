import java.util.Stack;
class Pilas{
    public static void main(String[] args) {
        Stack<Integer> pilap = new Stack<Integer>();
        Stack<Integer> pilai = new Stack<Integer>();
        for(int i = 0; i<=30; i++){
            if(i%2==0){
            pilap.push(i);
        }else{
            pilai.push(i);
        }
    }
        System.out.println(pilap);
        System.out.println(pilai);
}
}