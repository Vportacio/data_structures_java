package Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Queue data structure implementation
 *
 * Queue follow FIFO principle, suggest that first item added in queue it will be first out
 *
 * In this case has used a abstract class because the base of queue don`t have others heritages
 * this implementation discard the need of use interface (we don`t want mutiple heritage) 
 * 
 * @return
 * Add   - Self Arg added in queue <p>
 * Poll  - Pool first item in queue <p>
 * Show  - List all args in stack <p>
 * Peek  - Return first item in queue  <p>
 * 
 * @see  QueueBase
 * 
 **/
public class Queue<T> extends QueueBase<T> {

    private List<T> arr = new ArrayList<T>();
    private int size = 0;

    @Override
    public void add(T arg) {
        arr.add(arg);
        size = size + 1;
    }

    @Override
    public T poll() {
        T dequed = arr.get(0);
        arr.remove(0);
        size = size - 1;
        
        return dequed;
    }

    @Override
    public void show() {
        System.out.println(arr);
    }
    
    @Override
    public T peek() { return arr.isEmpty() ?  null : arr.get(0); }

    
}
