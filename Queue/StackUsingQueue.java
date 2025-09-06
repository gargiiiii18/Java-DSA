// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

// Implement the MyStack class:

// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:

// You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
 

// Example 1:

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False
 

// Constraints:

// 1 <= x <= 9
// At most 100 calls will be made to push, pop, top, and empty.
// All the calls to pop and top are valid.

package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public boolean flag = true;
    public int top = -1;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(flag == true){
            q1.offer(x);
        } else{
            q2.offer(x);
        }
        top = x;
    }
    
    public int pop() {
        if(flag == true){
        if(q1.size() == 1){
            return q1.poll();
        }
        while(q1.size() != 2){
            q2.offer(q1.poll());
        }
        top = q1.poll();
        // System.out.println("top: "+ top);
        q2.offer(top);
        flag = false;
        return q1.poll();
    } else{
         if(q2.size() == 1){
            return q2.poll();
        }
        while(q2.size() != 2){
            q1.offer(q2.poll());
        }
        top = q2.poll();
        // System.out.println("top: "+ top);
        q1.offer(top);
    }
    flag = true;
    return q2.poll();
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        // System.out.println("running func");
        if(flag == true){
            if(q1.isEmpty()) return true;
        } else {
            if(q2.isEmpty()) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        StackUsingQueue q = new StackUsingQueue();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

       System.out.println("top: "+ q.top()); //4
        q.pop(); 
        System.out.println("top: "+ q.top()); //3
        q.push(5);
        System.out.println("top: "+ q.top()); //5
        // System.out.println("queue empty: "+ q.empty());
        q.pop(); 
         System.out.println("top: "+ q.top());//3
        q.pop();
        System.out.println("top: "+ q.top()); //2

        System.out.println(q.q1);
        System.out.println(q.q2);

        System.out.println(q.empty());

        q.pop();
        q.pop();

        System.out.println(q.empty());

       
    }
}
