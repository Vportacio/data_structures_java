

import Stack.Stack;

public class MainStack {
    private static Stack<Integer> stack = new Stack<Integer>();
    
    public static void main(String[] args){

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.top());
    }
}
