package Stack;
import java.util.List;

public class Stack<T> extends StackBase<T> {

    private List<T> arr;
    private int size = 0;

    @Override
    public T push(T arg) {
        arr.add(arg);
        size += size;
        return arg;
    }
    
    @Override
    public void pop() {
        // TODO Auto-generated method stub
        
    }


}


class Main {
    
    
    private static Stack<String> pilha = new Stack<String>();
    
    public static void main(String[] args){

        pilha.push("oi");

        System.out.println("Chupa mi pinga");
    }
}