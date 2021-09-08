package advance.class19_stacksI.classroom;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    Deque<Integer> mainStack = new ArrayDeque<Integer>();
    Deque<Integer> minStack = new ArrayDeque<Integer>();


    public void push(int x) {


        if( mainStack.isEmpty() ||  x <= minStack.peek()){
            minStack.push(x);
        }
        mainStack.push(x);

    }

    public void pop() {
        if(mainStack.isEmpty()){
            minStack.push(-1);
            return;
        }
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();

        }
        mainStack.pop();
    }

    public int top() {
        if(mainStack.isEmpty()){
            return -1;
        }
        return mainStack.peek();
    }

    public int getMin() {

        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();

    }


    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(1);
        obj.push(2);
        obj.push(-2);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.getMin());
        System.out.println(obj.top());
        System.out.println("**************************");
        MinStack obj2 = new MinStack();
        System.out.println(obj2.getMin());
        obj2.pop();
        System.out.println(obj2.top());

        System.out.println("**************************");
        MinStack obj3 = new MinStack();
        obj.pop();
        System.out.println(obj3.getMin());

    }

}
