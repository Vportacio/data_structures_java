package Queue;

import java.util.ArrayList;
import java.util.List;

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
        arr.remove(0);
        size = size - 1;
        return null;
    }

    @Override
    public void show() {
        System.out.println(arr);
    }
    
    @Override
    public T peek() { return arr.isEmpty() ?  null : arr.get(0); }

    
}
