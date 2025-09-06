package Trials.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingONEQueue {

    public Queue<Integer> q1;

    public boolean flag = true;
    public int top = -1;

    public StackUsingONEQueue() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(flag == true){
            q1.offer(x);
        }
        top = x;
    }
    
    public int pop() {
        int toPop = top;
        while(q1.peek() != toPop){
            top = q1.peek();
            q1.offer(q1.poll());
        }
        return q1.poll();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
            if(q1.isEmpty()) return true;
            return false;
    }

    public static void main(String[] args) {
        
        StackUsingONEQueue q = new StackUsingONEQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        System.out.println("top: "+q.top());

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());

        System.out.println("top: "+q.top());

        q.push(6);
        q.push(7);
        q.push(8);
        
        System.out.println(q.q1);

        System.out.println(q.empty());

        System.out.println(q.pop());

        System.out.println(q.q1);

        System.out.println(q.empty());
    }

}
