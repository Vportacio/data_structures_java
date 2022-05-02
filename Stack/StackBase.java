package Stack;

import java.util.List;

abstract class StackBase<T> {

    public void pop() { }

    public T push(T arg) { return arg; }

    public T top() { return null; }

    public List<T> show() { return null; }

}