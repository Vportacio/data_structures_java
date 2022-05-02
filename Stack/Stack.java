package Stack;
import java.util.ArrayList;
import java.util.List;

/**
 * Stack data structure implementation
 *
 * Stack follow LIFO principle, suggest that first item added in stack it will be last out
 *
 * In this case has used a abstract class because the base of stack don`t have others heritages
 * this implementation discard the need of use interface (we don`t want mutiple heritage) 
 * 
 * @return
 * Push - Self Arg added in stack <p>
 * Pop  - Popped arg in stack <p>
 * Show - List all args in stack <p>
 * Top  - Last item in stack  <p>
 * 
 * @see  StackBase
 * 
 **/

public class Stack<T> extends StackBase<T> {

    private List<T> arr = new ArrayList<T>();
    private int size = 0;

    @Override
    public T push(T arg) {
        arr.add(arg);
        size = size + 1;
        return arg;
    }
    
    @Override
    public void pop() {        
        arr.remove(size - 1);
        size = size - 1;
    }

    @Override
    public T top() {
        return arr.get(size - 1); 
    }
    
    @Override
    public List<T> show() {
        System.out.println(arr);
        return super.show();
    }    
}